package org.example.patterns.criacionais.factory_method.problem;

public class ServicoEmail {
    public ServicoEmail(String smtp) {
    }

    public void enviarEmail(String destino, String assunto, String msg) {
        System.out.println("[E-MAIL] " + destino + ": " + msg);
    }
}
