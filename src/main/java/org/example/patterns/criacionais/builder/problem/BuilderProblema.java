package org.example.patterns.criacionais.builder.problem;

import java.util.Map;

public class BuilderProblema {
    public static void main(String[] args) {
        // Quem consegue ler isso? O que é cada parâmetro?
        Requisicao r1 = new Requisicao(
                "https://api.loja.com/pedidos", "POST",
                Map.of("Content-Type", "application/json"),
                "{\"id\": 1}", 10, 3, "abc123", true, true);

        // Só quero desligar o SSL, mas preciso preencher tudo antes
        Requisicao r2 = new Requisicao(
                "https://interno.loja.com", "GET", null, null,
                30, 0, null, true, false);

        System.out.println(r1);
        System.out.println(r2);
    }
}
