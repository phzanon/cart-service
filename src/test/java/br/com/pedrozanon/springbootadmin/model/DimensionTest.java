package br.com.pedrozanon.springbootadmin.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DimensionTest {

    @Test
    public void getValorPesoTest() {
        Dimension dimension = new Dimension("0","0","0","0","0");
        dimension.setValorPeso("1");
        Assert.assertTrue(dimension.getValorPeso().equals("1"));
    }

    @Test
    public void getValorComprimentoTest() {
        Dimension dimension = new Dimension("0","0","0","0","0");
        dimension.setValorComprimento("1");
        Assert.assertTrue(dimension.getValorComprimento().equals("1"));
    }

    @Test
    public void getValorAlturaTest() {
        Dimension dimension = new Dimension("0","0","0","0","0");
        dimension.setValorAltura("1");
        Assert.assertTrue(dimension.getValorAltura().equals("1"));
    }

    @Test
    public void getValorLarguraTest() {
        Dimension dimension = new Dimension("0","0","0","0","0");
        dimension.setValorLargura("1");
        Assert.assertTrue(dimension.getValorLargura().equals("1"));
    }

    @Test
    public void getValorDiametroTest() {
        Dimension dimension = new Dimension("0","0","0","0","0");
        dimension.setValorDiametro("1");
        Assert.assertTrue(dimension.getValorDiametro().equals("1"));
    }
}
