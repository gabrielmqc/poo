package org.example.patterns.criacionais.builder.solution;

// DIRECTOR: receitas de construção reutilizáveis
public class RequisicaoDirector {

    public void construirPostJson(Builder builder, String url, String corpo) {
        builder.definirUrl(url);
        builder.definirMetodo("POST");
        builder.adicionarHeader("Content-Type", "application/json");
        builder.definirCorpo(corpo);
        builder.definirTimeout(10);
        builder.definirTentativas(3);
        builder.verificarSsl(true);
    }

    public void construirGetSimples(Builder builder, String url) {
        builder.definirUrl(url);
        builder.definirMetodo("GET");
        builder.definirTimeout(30);
        builder.definirTentativas(0);
    }
}
