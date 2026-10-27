package org.example.patterns.estruturais.bridge.problem;

public class AlertaEmail extends Mensagem {
    public void enviar(String destino) {
        System.out.println("[E-MAIL] " + destino + ": ALERTA: sua senha foi alterada");
    }
}
