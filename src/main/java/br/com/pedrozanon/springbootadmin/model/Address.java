package br.com.pedrozanon.springbootadmin.model;

public class Address {

    private String cep;

    public Address(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }
}
