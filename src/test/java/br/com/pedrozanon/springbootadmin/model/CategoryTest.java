package br.com.pedrozanon.springbootadmin.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void getIdTest() {
        Category category = new Category("cat", "cat 1");
        category.setId(1L);
        Assert.assertTrue(category.getId() == 1L);
    }

    @Test
    public void getNameTest() {
        Category category = new Category("cat", "cat 1");
        category.setName("cat1");
        Assert.assertTrue(category.getName().equals("cat1"));
    }

    @Test
    public void getDescriptionTest() {
        Category category = new Category("cat", "cat 1");
        Assert.assertTrue(category.getDescription().equals("cat 1"));
    }
}
