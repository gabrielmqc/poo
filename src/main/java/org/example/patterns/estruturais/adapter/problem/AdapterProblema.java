package org.example.patterns.estruturais.adapter.problem;

import java.math.BigDecimal;

public class AdapterProblema {
    public static void main(String[] args) {
        PedidoService pedidos = new PedidoService();
        pedidos.pagar("legado", new BigDecimal("49.90"), "4111111111111111");
        pedidos.pagar("pagrapido", new BigDecimal("49.90"), "4111111111111111");
    }
}
