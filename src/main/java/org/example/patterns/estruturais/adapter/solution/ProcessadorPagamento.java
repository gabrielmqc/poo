package org.example.patterns.estruturais.adapter.solution;

import java.math.BigDecimal;

public interface ProcessadorPagamento {
    boolean pagar(BigDecimal valor, String cartao);
}
