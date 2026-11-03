package org.example.patterns.comportamentais.state.problem;

public class Pedido {
    private String status = "NOVO";

    void pagar() {
        if (status.equals("NOVO")) {
            status = "PAGO";
        } else {
            throw new IllegalStateException("Não é possível pagar um pedido " + status);
        }
    }

    void enviar() {
        if (status.equals("PAGO")) {
            status = "ENVIADO";
        } else {
            throw new IllegalStateException("Não é possível enviar um pedido " + status);
        }
    }

    void cancelar() {
        if (status.equals("NOVO") || status.equals("PAGO")) {
            status = "CANCELADO";
        } else {
            throw new IllegalStateException("Não é possível cancelar um pedido " + status);
        }
    }
}