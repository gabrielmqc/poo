package org.example.patterns.builder.solution;

public class BuilderSolucao {
    public static void main(String[] args) {
        // Legível: só define o que importa
        Requisicao r1 = new Requisicao.Builder("https://api.loja.com/pedidos")
                .metodo("POST")
                .header("Content-Type", "application/json")
                .corpo("{\"id\": 1}")
                .timeout(10)
                .tentativas(3)
                .token("abc123")
                .build();

        // Tudo no padrão
        Requisicao r2 = new Requisicao.Builder("https://interno.loja.com").build();

        // Usando o Director
        Requisicao r3 = RequisicaoDirector.postJson(
                "https://api.loja.com/clientes", "{\"nome\": \"Ana\"}", "abc123");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
