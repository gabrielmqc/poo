package org.example.patterns.comportamentais.state.solution;

public class StateSolution {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.pagar();
        pedido.enviar();
        try {
            pedido.cancelar();
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
