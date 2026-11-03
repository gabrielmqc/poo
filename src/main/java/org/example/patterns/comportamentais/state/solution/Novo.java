package org.example.patterns.comportamentais.state.solution;

public class Novo extends EstadoBase {
    @Override
    public void pagar(Pedido p) {
        p.setEstado(new Pago());
    }

    @Override
    public void cancelar(Pedido p) {
        p.setEstado(new Cancelado());
    }

    public String nome() {
        return "NOVO";
    }
}
