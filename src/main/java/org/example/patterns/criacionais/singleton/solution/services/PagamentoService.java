package org.example.patterns.criacionais.singleton.solution.services;

import org.example.patterns.criacionais.singleton.solution.AppLogger;
import org.example.patterns.criacionais.singleton.solution.Nivel;

public class PagamentoService {
    private final AppLogger logger = AppLogger.getInstance();

    public void cobrar() {
        logger.log(Nivel.DEBUG, "PagamentoService", "Consultando gateway de pagamento");
        logger.log(Nivel.INFO, "PagamentoService", "Pagamento aprovado");
    }
}
