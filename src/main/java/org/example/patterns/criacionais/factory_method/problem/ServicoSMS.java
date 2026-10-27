package org.example.patterns.criacionais.factory_method.problem;

public class ServicoSMS {
    public ServicoSMS(String apiKey) {
    }

    public void dispararSms(String destino, String msg) {
        System.out.println("[SMS] " + destino + ": " + msg);
    }
}
