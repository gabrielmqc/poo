package org.example.patterns.criacionais.builder.solution;

// Director (opcional): receitas de construção reutilizáveis
public class RequisicaoDirector {
    public static Requisicao postJson(String url, String corpo, String token) {
        return new Requisicao.Builder(url)
                .metodo("POST")
                .header("Content-Type", "application/json")
                .corpo(corpo)
                .token(token)
                .tentativas(3)
                .build();
    }
}
