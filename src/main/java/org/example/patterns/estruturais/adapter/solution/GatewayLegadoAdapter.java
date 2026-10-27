package org.example.patterns.estruturais.adapter.solution;

import java.math.BigDecimal;

public class GatewayLegadoAdapter implements ProcessadorPagamento {
    private final GatewayLegado gateway;                   // objeto adaptado (Adaptee)

    public GatewayLegadoAdapter(GatewayLegado gateway) {
        this.gateway = gateway;
    }

    public boolean pagar(BigDecimal valor, String cartao) {
        int centavos = valor.movePointRight(2).intValue();
        return gateway.efetuarCobranca(centavos, cartao) == 0;
    }
}
