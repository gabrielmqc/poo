package org.example.patterns.criacionais.builder.solution;

import java.util.HashMap;
import java.util.Map;

// CONCRETE BUILDER: mantém o estado parcial
public class RequisicaoBuilder implements Builder {
    private String url;
    private String metodo = "GET";
    private final Map<String, String> headers = new HashMap<>();
    private String corpo;
    private int timeout = 30;
    private int tentativas = 0;
    private String token;
    private boolean seguirRedirect = true;
    private boolean verificarSsl = true;

    @Override
    public void definirUrl(String url) {
        this.url = url;
    }

    @Override
    public void definirMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public void adicionarHeader(String chave, String valor) {
        headers.put(chave, valor);
    }

    @Override
    public void definirCorpo(String corpo) {
        this.corpo = corpo;
    }

    @Override
    public void definirTimeout(int segundos) {
        this.timeout = segundos;
    }

    @Override
    public void definirTentativas(int quantidade) {
        this.tentativas = quantidade;
    }

    @Override
    public void definirToken(String token) {
        this.token = token;
    }

    @Override
    public void seguirRedirects(boolean seguir) {
        this.seguirRedirect = seguir;
    }

    @Override
    public void verificarSsl(boolean verificar) {
        this.verificarSsl = verificar;
    }

    @Override
    public Requisicao build() {
        if (url == null || url.isBlank()) {
            throw new IllegalStateException("URL obrigatória");
        }

        if (timeout <= 0 || tentativas < 0) {
            throw new IllegalStateException("Configuração inválida");
        }

        if ("GET".equalsIgnoreCase(metodo) && corpo != null) {
            throw new IllegalStateException("GET não deve ter corpo");
        }

        return new Requisicao(
                url, metodo, headers, corpo, timeout,
                tentativas, token, seguirRedirect, verificarSsl
        );
    }
}
