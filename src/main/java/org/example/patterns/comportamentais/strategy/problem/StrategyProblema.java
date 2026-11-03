package org.example.patterns.comportamentais.strategy.problem;

public class StrategyProblema {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(2.5);
        System.out.println("PAC: R$ " + pedido.calcularFrete("pac"));            // 17.5
        System.out.println("SEDEX: R$ " + pedido.calcularFrete("sedex"));        // 37.5
        System.out.println("Retirada: R$ " + pedido.calcularFrete("retirada"));  // 0.0
    }
}
