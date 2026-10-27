package org.example.patterns.estruturais.adapter.solution;

import java.math.BigDecimal;

public class PedidoService {
    private final ProcessadorPagamento processador;

    public PedidoService(ProcessadorPagamento processador) {
        this.processador = processador;
    }

    public boolean pagar(BigDecimal valor, String cartao) {
        return processador.pagar(valor, cartao);
    }
}
