package br.com.pedrozanon.springbootadmin.service;

import br.com.pedrozanon.springbootadmin.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceTest {

    private CartService cartService = new CartService();

    private Cart cart = new Cart();

    @Test
    public void checkout() {
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
        Assert.assertNotEquals(cart.getTotalDelivery(), 10);
    }
}
