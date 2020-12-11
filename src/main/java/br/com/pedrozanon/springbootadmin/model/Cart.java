package br.com.pedrozanon.springbootadmin.model;

import br.com.pedrozanon.springbootadmin.model.enums.StatusCart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private Long id;
    private Customer customer;
    private StatusCart status;
    private String payment;
    private String coupon;
    private double totalDelivery;
    private double totalValueCart;
    private List<Product> items;

    public Cart() {
    }

    public Cart(Customer customer, String payment, String coupon) {
        this.customer = customer;
        this.status = StatusCart.NEW;
        this.payment = payment;
        this.coupon = coupon;
        this.items = new ArrayList<>();
        this.totalDelivery = 0L;
        this.totalValueCart = 0L;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public StatusCart getStatus() {
        return status;
    }

    public void setStatus(StatusCart status) {
        this.status = status;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItem(Product item) {
        this.items.add(item);
    }

    public double getTotalDelivery() {
        return totalDelivery;
    }

    public void setTotalDelivery(double totalDelivery) {
        this.totalDelivery = totalDelivery;
    }

    public double getTotalValueCart() {
        return totalValueCart;
    }

    public void setTotalValueCart(double totalValueCart) {
        this.totalValueCart = totalValueCart;
    }
}
