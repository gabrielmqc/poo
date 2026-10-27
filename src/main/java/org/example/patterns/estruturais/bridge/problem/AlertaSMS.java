package org.example.patterns.estruturais.bridge.problem;

public class AlertaSMS extends Mensagem {
    public void enviar(String destino) {
        System.out.println("[SMS] " + destino + ": ALERTA: sua senha foi alterada");
    }
}
