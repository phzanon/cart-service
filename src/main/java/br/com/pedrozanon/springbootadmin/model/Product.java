package br.com.pedrozanon.springbootadmin.model;

public class Product {

    private Long id;
    private String name;
    private String description;
    private Category category;
    private double discount;
    private double price;
    private boolean hasDiscount;
    private Dimension dimension;
    private double deliveryValue;
    private int deliveryTime;
    private double tax;

    public Product(String name, String description, Category category, double discount, double price, boolean hasDiscount, Dimension dimension, double tax) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.discount = discount;
        this.price = price;
        this.hasDiscount = hasDiscount;
        this.dimension = dimension;
        this.deliveryTime = 0;
        this.deliveryValue = 0L;
        this.tax = tax;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public double getDeliveryValue() {
        return deliveryValue;
    }

    public void setDeliveryValue(double deliveryValue) {
        this.deliveryValue = deliveryValue;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
