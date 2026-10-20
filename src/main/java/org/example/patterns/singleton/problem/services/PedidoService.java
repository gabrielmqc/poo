package org.example.patterns.singleton.problem.services;

import org.example.patterns.singleton.problem.AppLogger;
import org.example.patterns.singleton.problem.Nivel;

public class PedidoService {
    private final AppLogger logger = new AppLogger();      // instância própria

    public void criarPedido() {
        logger.log(Nivel.DEBUG, "Validando itens do pedido");
        logger.log(Nivel.INFO, "Pedido criado");
    }

    public AppLogger getLogger() {
        return logger;
    }
}
