package org.example.patterns.comportamentais.state.solution;

// STATE: uma operação por ação do contexto
public interface Estado {
    void pagar(Pedido pedido);
    void enviar(Pedido pedido);
    void cancelar(Pedido pedido);
    String nome();
}
