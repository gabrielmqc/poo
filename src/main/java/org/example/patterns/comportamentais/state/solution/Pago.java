package org.example.patterns.comportamentais.state.solution;

public class Pago extends EstadoBase {
    @Override
    public void enviar(Pedido p) {
        p.setEstado(new Enviado());
    }

    @Override
    public void cancelar(Pedido p) {
        p.setEstado(new Cancelado());
    }

    public String nome() {
        return "PAGO";
    }
}