package org.example.patterns.singleton.problem.services;

import org.example.patterns.singleton.problem.AppLogger;
import org.example.patterns.singleton.problem.Nivel;

public class ClienteService {
    private final AppLogger logger = new AppLogger();      // outra instância

    public void cadastrar() {
        logger.log(Nivel.DEBUG, "Validando CPF do cliente");
        logger.log(Nivel.INFO, "Cliente cadastrado");
    }
}
