package org.example.patterns.estruturais.facade.solution;

public class EmailService {
    void enviar(String destino, String msg) {
        System.out.println("E-mail para " + destino + ": " + msg);
    }
}
