package org.example.patterns.comportamentais.strategy.solution;

// CONTEXT: usa a estratégia sem saber qual é
public class Pedido {
    private final double pesoKg;
    private CalculoFrete frete;

    Pedido(double pesoKg, CalculoFrete frete) {
        this.pesoKg = pesoKg;
        this.frete = frete;
    }

    void setFrete(CalculoFrete frete) {
        this.frete = frete;
    }

    double calcularFrete() {
        return frete.calcular(pesoKg);
    }
}
