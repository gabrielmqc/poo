package org.example.patterns.criacionais.singleton.solution.services;

import org.example.patterns.criacionais.singleton.solution.AppLogger;
import org.example.patterns.criacionais.singleton.solution.Nivel;

public class PedidoService {
    private final AppLogger logger = AppLogger.getInstance();   // sempre a mesma

    public void criarPedido() {
        logger.log(Nivel.DEBUG, "PedidoService", "Validando itens do pedido");
        logger.log(Nivel.INFO, "PedidoService", "Pedido criado");
    }
}
