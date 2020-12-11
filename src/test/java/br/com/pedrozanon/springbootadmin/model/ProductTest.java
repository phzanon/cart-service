package br.com.pedrozanon.springbootadmin.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void getIdTest() {
        Category c1 = new Category("Revista", "Revista");
        Dimension dimension = new Dimension("0.3", "30", "2", "15", "0.0");
        Product product1 = new Product("Smartphone", "Apple Iphone 20", c1, 10.0, 4000.0, true, dimension, 27.5);
        product1.setId(1L);
        Assert.assertTrue(product1.getId() == 1L);
    }

    @Test
    public void getNameTest() {
        Category c1 = new Category("Revista", "Revista");
        Dimension dimension = new Dimension("0.3", "30", "2", "15", "0.0");
        Product product1 = new Product("Smartphone", "Apple Iphone 20", c1, 10.0, 4000.0, true, dimension, 27.5);
        product1.setName("produto");
        Assert.assertTrue(product1.getName().equals("produto"));
    }

    @Test
    public void getDescriptionTest() {
        Category c1 = new Category("Revista", "Revista");
        Dimension dimension = new Dimension("0.3", "30", "2", "15", "0.0");
        Product product1 = new Product("Smartphone", "Apple Iphone 20", c1, 10.0, 4000.0, true, dimension, 27.5);
        product1.setDescription("produto");
        product1.setCategory(c1);
        Assert.assertTrue(product1.getDescription().equals("produto"));
    }

    @Test
    public void getDiscountTest() {
        Category c1 = new Category("Revista", "Revista");
        Dimension dimension = new Dimension("0.3", "30", "2", "15", "0.0");
        Product product1 = new Product("Smartphone", "Apple Iphone 20", c1, 10.0, 4000.0, true, dimension, 27.5);
        product1.setDiscount(10.0);
        product1.setPrice(10.0);
        Assert.assertTrue(product1.getDiscount() == 10.0);
    }


    @Test
    public void hasDiscountTest() {
        Category c1 = new Category("Revista", "Revista");
        Dimension dimension = new Dimension("0.3", "30", "2", "15", "0.0");
        Product product1 = new Product("Smartphone", "Apple Iphone 20", c1, 10.0, 4000.0, true, dimension, 27.5);
        product1.setHasDiscount(true);
        product1.setDimension(dimension);
        Assert.assertTrue(product1.isHasDiscount());
    }

}
