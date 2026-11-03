package org.example.patterns.comportamentais.state.solution;

// CONTEXT: delega ao estado atual
public class Pedido {
    private Estado estado = new Novo();

    void setEstado(Estado novo) {
        System.out.println(estado.nome() + " → " + novo.nome());
        this.estado = novo;
    }

    void pagar() {
        estado.pagar(this);
    }

    void enviar() {
        estado.enviar(this);
    }

    void cancelar() {
        estado.cancelar(this);
    }
}
