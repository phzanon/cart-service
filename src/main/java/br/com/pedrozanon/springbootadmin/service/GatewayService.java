package br.com.pedrozanon.springbootadmin.service;

import br.com.pedrozanon.springbootadmin.model.dto.RequestParams;
import br.com.pedrozanon.springbootadmin.model.dto.Servicos;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

public class GatewayService {

    public static Servicos sendWS(RequestParams request) {
        try {
            HttpClient httpClient = new DefaultHttpClient();
            //HttpGet request = new HttpGet("http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?sCepOrigem=04094-050&sCepDestino=90619-900&nVlPeso=0.3&nVlComprimento=30&nVlAltura=2&nVlLargura=15&nVlDiametro=0.0&nCdFormato=1&sCdMaoPropria=N&sCdAvisoRecebimento=N&nVlValorDeclarado=0,00&nCdServico=04510&nCdEmpresa=&sDsSenha=&StrRetorno=xml");
            HttpGet requestHttp = new HttpGet("http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?" + request.urlComplete());
            HttpResponse httpResponse = httpClient.execute(requestHttp);
            ObjectMapper objectMapper = new ObjectMapper();
            Servicos response = deserializeFromXml(httpResponse.getEntity());
            return response;
        }catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    public static Servicos deserializeFromXml(HttpEntity httpEntity) throws IOException {
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(httpEntity.getContent(), Servicos.class);
    }
}
