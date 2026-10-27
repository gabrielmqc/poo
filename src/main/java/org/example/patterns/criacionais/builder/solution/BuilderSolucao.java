package org.example.patterns.criacionais.builder.solution;

public class BuilderSolucao {
    public static void main(String[] args) {
        RequisicaoDirector director = new RequisicaoDirector();

        // Construção usando uma receita do Director
        RequisicaoBuilder builder1 = new RequisicaoBuilder();
        director.construirPostJson(
                builder1,
                "https://api.loja.com/pedidos",
                "{\"id\": 1}"
        );
        builder1.definirToken("abc123");
        Requisicao r1 = builder1.build();

        // Construção personalizada, sem usar o Director
        RequisicaoBuilder builder2 = new RequisicaoBuilder();
        builder2.definirUrl("https://interno.loja.com");
        builder2.verificarSsl(false);
        Requisicao r2 = builder2.build();

        System.out.println(r1);
        System.out.println(r2);
    }
}
