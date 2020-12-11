package br.com.pedrozanon.springbootadmin.service;

import br.com.pedrozanon.springbootadmin.model.Cart;
import br.com.pedrozanon.springbootadmin.model.Product;
import br.com.pedrozanon.springbootadmin.model.dto.RequestParams;
import br.com.pedrozanon.springbootadmin.model.dto.Servicos;
import br.com.pedrozanon.springbootadmin.model.enums.StatusCart;
import org.springframework.beans.factory.annotation.Autowired;

public class CartService {

    @Autowired
    private MailService mailService;

    public CartService() {
    }

    public Cart checkout(Cart cart) {
        double total;
        double totalDelivery = 0L;
        //for each item, calculate delivery value and delivery time
        cart.getItems().forEach(i -> {
            if(!i.getCategory().getDescription().equals("Mídia Digital")){
                //parameters to send correios web service
                RequestParams requestParams = new RequestParams("04094-050",
                        cart.getCustomer().getAddress().getCep(),
                        i.getDimension().getValorPeso(),
                        i.getDimension().getValorComprimento(),
                        i.getDimension().getValorAltura(),
                        i.getDimension().getValorLargura(),
                        i.getDimension().getValorDiametro(),
                        "1",
                        "N",
                        "N",
                        "0,00",
                        "04510",
                        "",
                        "",
                        "xml"
                );
                //send correio web service
                Servicos servicos = GatewayService.sendWS(requestParams);
                if(servicos != null) {
                    i.setDeliveryTime(Integer.parseInt(servicos.getServicos().getPrazoEntrega()));
                    i.setDeliveryValue(Double.parseDouble(servicos.getServicos().getValor().replace(",",".")));
                }
            }

            //if item have discount, apply discount
            if(cart.getCoupon().equals("true") && i.isHasDiscount()) {
                i.setPrice(i.getPrice() - (i.getPrice() * i.getDiscount() / 100.0));
            }

            //tax rule
            i = haveTax(i);
        });

        //total cart value
        total = cart.getItems().stream().mapToDouble(Product::getPrice).sum();
        //total delivery value
        totalDelivery = cart.getItems().stream().mapToDouble(Product::getDeliveryValue).sum();

        cart.setTotalDelivery(totalDelivery);
        cart.setTotalValueCart(total);
        cart.setStatus(StatusCart.FINALIZED);

        //send email
        mailService.sendEmail(cart.getCustomer().getEmail());
        return cart;
    }

    public Product haveTax(Product p) {
        if(p.getCategory().getDescription().equals("Livro") ||
                p.getCategory().getDescription().equals("Revista") ||
                p.getCategory().getDescription().equals("Jornal") ||
                p.getCategory().getDescription().equals("E-reader")) {
            p.setTax(0L);
        }

        return p;
    }
}
