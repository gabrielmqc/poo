package org.example.patterns.estruturais.adapter.solution;

import java.math.BigDecimal;

public class PagRapidoAdapter implements ProcessadorPagamento {
    private final PagRapido pagRapido;

    public PagRapidoAdapter(PagRapido pagRapido) {
        this.pagRapido = pagRapido;
    }

    public boolean pagar(BigDecimal valor, String cartao) {
        return pagRapido.cobrar(cartao, valor.doubleValue(), "BRL")
                .status.equals("APROVADO");
    }
}
