package org.example.patterns.estruturais.adapter.problem;

import java.math.BigDecimal;

public class PedidoService {
    public boolean pagar(String provedor, BigDecimal valor, String cartao) {
        if (provedor.equals("legado")) {
            GatewayLegado g = new GatewayLegado();
            int codigo = g.efetuarCobranca(valor.movePointRight(2).intValue(), cartao);
            return codigo == 0;
        } else if (provedor.equals("pagrapido")) {
            PagRapido p = new PagRapido();
            return p.cobrar(cartao, valor.doubleValue(), "BRL").status.equals("APROVADO");
        }
        throw new IllegalArgumentException("Provedor inválido: " + provedor);
    }
}
