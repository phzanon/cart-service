package br.com.pedrozanon.springbootadmin.model;

public class Dimension {

    private String valorPeso;
    private String valorComprimento;
    private String valorAltura;
    private String valorLargura;
    private String valorDiametro;

    public Dimension(String valorPeso, String valorComprimento, String valorAltura, String valorLargura, String valorDiametro) {
        this.valorPeso = valorPeso;
        this.valorComprimento = valorComprimento;
        this.valorAltura = valorAltura;
        this.valorLargura = valorLargura;
        this.valorDiametro = valorDiametro;
    }

    public String getValorPeso() {
        return valorPeso;
    }

    public void setValorPeso(String valorPeso) {
        this.valorPeso = valorPeso;
    }

    public String getValorComprimento() {
        return valorComprimento;
    }

    public void setValorComprimento(String valorComprimento) {
        this.valorComprimento = valorComprimento;
    }

    public String getValorAltura() {
        return valorAltura;
    }

    public void setValorAltura(String valorAltura) {
        this.valorAltura = valorAltura;
    }

    public String getValorLargura() {
        return valorLargura;
    }

    public void setValorLargura(String valorLargura) {
        this.valorLargura = valorLargura;
    }

    public String getValorDiametro() {
        return valorDiametro;
    }

    public void setValorDiametro(String valorDiametro) {
        this.valorDiametro = valorDiametro;
    }
}
