package br.com.pedrozanon.springbootadmin.controller;

import br.com.pedrozanon.springbootadmin.model.*;
import br.com.pedrozanon.springbootadmin.service.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

    private CartService cartService = new CartService();

    @GetMapping
    public ResponseEntity<Cart> checkout() {
        Customer customer = new Customer("Pedro", "p.hzanon123@gmail.com", "17900-000");
        Cart cart = new Cart(customer, "Debit Card", "false");
        Category c1 = new Category("Electronic", "Electronics in general");
        Category c2 = new Category("Jornal", "Journal");
        Category c3 = new Category("Revista", "Revista");
        Dimension dimension = new Dimension("0.3", "30", "2", "15", "0.0");
        Product product1 = new Product("Smartphone", "Apple Iphone 20", c1, 10.0, 4000.0, true, dimension, 27.5);
        Product product2 = new Product("Estadão", "jornal estadão", c2, 10.0, 4000.0, true, dimension, 27.5);
        Product product3 = new Product("Revista", "revista veja", c3, 10.0, 4000.0, true, dimension, 27.5);
        cart.setItem(product1);
        cart.setItem(product2);
        cart.setItem(product3);
        cart = cartService.checkout(cart);
        return ResponseEntity.ok(cart);
    }
}
