package org.example.patterns.singleton.problem.services;

import org.example.patterns.singleton.problem.AppLogger;
import org.example.patterns.singleton.problem.Nivel;

public class PagamentoService {
    private final AppLogger logger = new AppLogger();      // mais uma

    public void cobrar() {
        logger.log(Nivel.DEBUG, "Consultando gateway de pagamento");
        logger.log(Nivel.INFO, "Pagamento aprovado");
    }
}
