package org.example.patterns.builder.problem;

import java.util.HashMap;
import java.util.Map;

public class Requisicao {
    final String url;
    final String metodo;
    final Map<String, String> headers;
    final String corpo;
    final int timeout;
    final int tentativas;
    final String token;
    final boolean seguirRedirect;
    final boolean verificarSsl;

    // Construtor telescópico: 9 parâmetros posicionais
    public Requisicao(String url, String metodo, Map<String, String> headers,
               String corpo, int timeout, int tentativas, String token,
               boolean seguirRedirect, boolean verificarSsl) {
        this.url = url;
        this.metodo = metodo;
        this.headers = headers == null ? new HashMap<>() : headers;
        this.corpo = corpo;
        this.timeout = timeout;
        this.tentativas = tentativas;
        this.token = token;
        this.seguirRedirect = seguirRedirect;
        this.verificarSsl = verificarSsl;
    }

    @Override
    public String toString() {
        return metodo + " " + url + " (timeout=" + timeout + ", tentativas=" + tentativas
                + ", ssl=" + verificarSsl + ")";
    }
}
