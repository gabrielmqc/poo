package org.example.patterns.comportamentais.state.solution;

// Comportamento padrão: ação inválida. Cada estado sobrescreve só o que permite
public abstract class EstadoBase implements Estado {
    public void pagar(Pedido p) {
        throw new IllegalStateException("Não é possível pagar um pedido " + nome());
    }

    public void enviar(Pedido p) {
        throw new IllegalStateException("Não é possível enviar um pedido " + nome());
    }

    public void cancelar(Pedido p) {
        throw new IllegalStateException("Não é possível cancelar um pedido " + nome());
    }
}