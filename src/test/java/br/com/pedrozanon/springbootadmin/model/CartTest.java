package br.com.pedrozanon.springbootadmin.model;

import br.com.pedrozanon.springbootadmin.model.enums.StatusCart;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CartTest {

    @Test
    public void getIdTest() {
        Cart cart = new Cart();
        cart.setId(1L);
        Assert.assertTrue(cart.getId().equals(1L));
    }

    @Test
    public void getCustomerTest() {
        Cart cart = new Cart();
        Customer customer = new Customer("Pedro", "p.hzanon123@gmail.com", "17900-000");
        cart.setCustomer(customer);
        Assert.assertEquals(cart.getCustomer().getName(), "Pedro");
    }

    @Test
    public void getStatusTest() {
        Cart cart = new Cart();
        cart.setStatus(StatusCart.NEW);
        Assert.assertEquals(cart.getStatus(), StatusCart.NEW);
    }

    @Test
    public void getPaymentTest() {
        Cart cart = new Cart();
        cart.setPayment("Card");
        Assert.assertTrue(cart.getPayment().equals("Card"));
    }

    @Test
    public void getCouponTest() {
        Cart cart = new Cart();
        cart.setCoupon("123456");
        Assert.assertTrue(cart.getCoupon().equals("123456"));
    }

    @Test
    public void getTotalValueTest() {
        Cart cart = new Cart();
        cart.setTotalValueCart(100.0);
        Assert.assertTrue(cart.getTotalValueCart() == 100.0);
    }
}
