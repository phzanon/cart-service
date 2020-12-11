package br.com.pedrozanon.springbootadmin.model.dto;

public class RequestParams {
    private String sCepOrigem;
    private String sCepDestino;
    private String nVlPeso;
    private String nVlComprimento;
    private String nVlAltura;
    private String nVlLargura;
    private String nVlDiametro;
    private String nCdFormato;
    private String sCdMaoPropria;
    private String sCdAvisoRecebimento;
    private String nVlValorDeclarado;
    private String nCdServico;
    private String nCdEmpresa;
    private String sDsSenha;
    private String StrRetorno;

    public RequestParams(String sCepOrigem, String sCepDestino, String nVlPeso, String nVlComprimento, String nVlAltura, String nVlLargura, String nVlDiametro, String nCdFormato, String sCdMaoPropria, String sCdAvisoRecebimento, String nVlValorDeclarado, String nCdServico, String nCdEmpresa, String sDsSenha, String strRetorno) {
        this.sCepOrigem = sCepOrigem;
        this.sCepDestino = sCepDestino;
        this.nVlPeso = nVlPeso;
        this.nVlComprimento = nVlComprimento;
        this.nVlAltura = nVlAltura;
        this.nVlLargura = nVlLargura;
        this.nVlDiametro = nVlDiametro;
        this.nCdFormato = nCdFormato;
        this.sCdMaoPropria = sCdMaoPropria;
        this.sCdAvisoRecebimento = sCdAvisoRecebimento;
        this.nVlValorDeclarado = nVlValorDeclarado;
        this.nCdServico = nCdServico;
        this.nCdEmpresa = nCdEmpresa;
        this.sDsSenha = sDsSenha;
        StrRetorno = strRetorno;
    }

    public String urlComplete() {
        String url = "";

        url += "sCepOrigem=" + this.sCepOrigem + "&";
        url += "sCepDestino=" + this.sCepDestino + "&";
        url += "nVlPeso=" + this.nVlPeso + "&";
        url += "nVlComprimento=" + this.nVlComprimento + "&";
        url += "nVlAltura=" + this.nVlAltura + "&";
        url += "nVlLargura=" + this.nVlLargura + "&";
        url += "nVlDiametro=" + this.nVlDiametro + "&";
        url += "nCdFormato=" + this.nCdFormato + "&";
        url += "sCdMaoPropria=" + this.sCdMaoPropria + "&";
        url += "sCdAvisoRecebimento=" + this.sCdAvisoRecebimento + "&";
        url += "nVlValorDeclarado=" + this.nVlValorDeclarado + "&";
        url += "nCdServico=" + this.nCdServico + "&";
        url += "nCdEmpresa=" + this.nCdEmpresa + "&";
        url += "sDsSenha=" + this.sDsSenha + "&";
        url += "StrRetorno=" + this.StrRetorno;

        return url;
    }
}
