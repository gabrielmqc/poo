package org.example.patterns.estruturais.adapter.solution;

import java.math.BigDecimal;

public class AdapterSolucao {
    public static void main(String[] args) {
        PedidoService comLegado =
                new PedidoService(new GatewayLegadoAdapter(new GatewayLegado()));
        PedidoService comPagRapido =
                new PedidoService(new PagRapidoAdapter(new PagRapido()));

        comLegado.pagar(new BigDecimal("49.90"), "4111111111111111");
        comPagRapido.pagar(new BigDecimal("49.90"), "4111111111111111");
    }
}
