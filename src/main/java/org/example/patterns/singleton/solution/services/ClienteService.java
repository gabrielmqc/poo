package org.example.patterns.singleton.solution.services;

import org.example.patterns.singleton.solution.AppLogger;
import org.example.patterns.singleton.solution.Nivel;

public class ClienteService {
    private final AppLogger logger = AppLogger.getInstance();

    public void cadastrar() {
        logger.log(Nivel.DEBUG, "ClienteService", "Validando CPF do cliente");
        logger.log(Nivel.INFO, "ClienteService", "Cliente cadastrado");
    }
}
