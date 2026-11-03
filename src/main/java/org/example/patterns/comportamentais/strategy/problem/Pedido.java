package org.example.patterns.comportamentais.strategy.problem;

public class Pedido {
    private final double pesoKg;

    Pedido(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    double calcularFrete(String tipo) {
        if (tipo.equals("pac")) {
            return 10.0 + pesoKg * 3.0;
        } else if (tipo.equals("sedex")) {
            return 25.0 + pesoKg * 5.0;
        } else if (tipo.equals("retirada")) {
            return 0.0;
        }
        // amanhã: transportadora própria, frete grátis, frete por região...
        throw new IllegalArgumentException("Tipo de frete inválido: " + tipo);
    }
}
