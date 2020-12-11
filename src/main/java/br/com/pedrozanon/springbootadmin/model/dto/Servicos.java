package br.com.pedrozanon.springbootadmin.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Servicos {

    @JsonProperty("cServico")
    private CServico cServico;

    public CServico getServicos() {
        return cServico;
    }
}
