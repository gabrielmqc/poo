package org.example.patterns.criacionais.factory_method.problem;

public class ServicoPush {
    public ServicoPush(String tokenApp) {
    }

    public void notificar(String destino, String msg) {
        System.out.println("[PUSH] " + destino + ": " + msg);
    }

}
