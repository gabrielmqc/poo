package org.example.patterns.comportamentais.strategy.solution;

public class StrategySolucao {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(2.5, new FretePAC());
        System.out.println("PAC: R$ " + pedido.calcularFrete());          // 17.5

        pedido.setFrete(new FreteSedex());                                // troca em runtime
        System.out.println("SEDEX: R$ " + pedido.calcularFrete());        // 37.5

        pedido.setFrete(new FreteRetirada());
        System.out.println("Retirada: R$ " + pedido.calcularFrete());     // 0.0
    }
}
