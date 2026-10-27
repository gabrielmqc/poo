package org.example.patterns.criacionais.builder.solution;

import java.util.Map;

// PRODUCT: objeto complexo final
public class Requisicao {
    private final String url;
    private final String metodo;
    private final Map<String, String> headers;
    private final String corpo;
    private final int timeout;
    private final int tentativas;
    private final String token;
    private final boolean seguirRedirect;
    private final boolean verificarSsl;

    Requisicao(
            String url,
            String metodo,
            Map<String, String> headers,
            String corpo,
            int timeout,
            int tentativas,
            String token,
            boolean seguirRedirect,
            boolean verificarSsl) {

        this.url = url;
        this.metodo = metodo;
        this.headers = Map.copyOf(headers);
        this.corpo = corpo;
        this.timeout = timeout;
        this.tentativas = tentativas;
        this.token = token;
        this.seguirRedirect = seguirRedirect;
        this.verificarSsl = verificarSsl;
    }

    @Override
    public String toString() {
        return metodo + " " + url
                + " (timeout=" + timeout
                + ", tentativas=" + tentativas
                + ", ssl=" + verificarSsl
                + ", redirect=" + seguirRedirect
                + ", headers=" + headers + ")";
    }
}
