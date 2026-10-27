package org.example.patterns.criacionais.builder.solution;

import java.util.HashMap;
import java.util.Map;

public class Requisicao {
    private final String url;
    private final String metodo;
    private final Map<String, String> headers;
    private final String corpo;
    private final int timeout;
    private final int tentativas;
    private final String token;

    // Construtor privado: só o Builder cria
    private Requisicao(Builder b) {
        this.url = b.url;
        this.metodo = b.metodo;
        this.headers = b.headers;
        this.corpo = b.corpo;
        this.timeout = b.timeout;
        this.tentativas = b.tentativas;
        this.token = b.token;
    }

    @Override
    public String toString() {
        return metodo + " " + url + " (timeout=" + timeout + ", tentativas=" + tentativas
                + ", headers=" + headers + ", corpo=" + corpo + ")";
    }

    // BUILDER
    public static class Builder {
        private final String url;                      // obrigatório
        private String metodo = "GET";
        private final Map<String, String> headers = new HashMap<>();
        private String corpo;
        private int timeout = 30;
        private int tentativas = 0;
        private String token;

        Builder(String url) { this.url = url; }

        Builder metodo(String m)         { this.metodo = m; return this; }
        Builder header(String k, String v) { this.headers.put(k, v); return this; }
        Builder corpo(String c)          { this.corpo = c; return this; }
        Builder timeout(int segundos)    { this.timeout = segundos; return this; }
        Builder tentativas(int n)        { this.tentativas = n; return this; }
        Builder token(String t)          { this.token = t; return this; }

        public Requisicao build() {
            // Validação das regras entre campos
            if (metodo.equals("GET") && corpo != null) {
                throw new IllegalStateException("GET não deve ter corpo");
            }
            return new Requisicao(this);
        }
    }
}
