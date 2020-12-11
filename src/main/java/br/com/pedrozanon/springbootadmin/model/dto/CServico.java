package br.com.pedrozanon.springbootadmin.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CServico {
    @JsonProperty("Codigo")
    private String Codigo;
    @JsonProperty("Valor")
    private String Valor;
    @JsonProperty("PrazoEntrega")
    private String PrazoEntrega;
    @JsonProperty("ValorSemAdicionais")
    private String ValorSemAdicionais;
    @JsonProperty("ValorMaoPropria")
    private String ValorMaoPropria;
    @JsonProperty("ValorAvisoRecebimento")
    private String ValorAvisoRecebimento;
    @JsonProperty("ValorValorDeclarado")
    private String ValorValorDeclarado;
    @JsonProperty("EntregaDomiciliar")
    private String EntregaDomiciliar;
    @JsonProperty("EntregaSabado")
    private String EntregaSabado;
    @JsonProperty("obsFim")
    private String obsFim;
    @JsonProperty("Erro")
    private String Erro;
    @JsonProperty("MsgErro")
    private String MsgErro;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String valor) {
        Valor = valor;
    }

    public String getPrazoEntrega() {
        return PrazoEntrega;
    }

    public void setPrazoEntrega(String prazoEntrega) {
        PrazoEntrega = prazoEntrega;
    }

    public String getValorSemAdicionais() {
        return ValorSemAdicionais;
    }

    public void setObsFim(String obsFim) {
        this.obsFim = obsFim;
    }
}
