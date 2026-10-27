package org.example.patterns.criacionais.singleton.problem.services;

import org.example.patterns.criacionais.singleton.problem.AppLogger;
import org.example.patterns.criacionais.singleton.problem.Nivel;

public class PagamentoService {
    private final AppLogger logger = new AppLogger();      // mais uma

    public void cobrar() {
        logger.log(Nivel.DEBUG, "Consultando gateway de pagamento");
        logger.log(Nivel.INFO, "Pagamento aprovado");
    }
}
