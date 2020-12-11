package br.com.pedrozanon.springbootadmin.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    public void getIdTest() {
        Customer customer = new Customer("Pedro", "p.hzanon123@gmail.com", "17900-000");
        customer.setId(1L);
        Assert.assertTrue(customer.getId() == 1L);
    }

    @Test
    public void getNameTest() {
        Customer customer = new Customer("Pedro", "p.hzanon123@gmail.com", "17900-000");
        customer.setName("Pedro");
        Assert.assertTrue(customer.getName().equals("Pedro"));
    }

    @Test
    public void getEmailTest() {
        Customer customer = new Customer("Pedro", "p.hzanon123@gmail.com", "17900-000");
        customer.setEmail("pedro@email.com");
        Assert.assertTrue(customer.getEmail().equals("pedro@email.com"));
    }

    @Test
    public void getAddressTest() {
        Customer customer = new Customer("Pedro", "p.hzanon123@gmail.com", "17900-000");
        Address address = new Address("01");
        customer.setAddress(address);
        Assert.assertTrue(customer.getAddress().getCep().equals("01"));
    }
}
