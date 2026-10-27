package org.example.patterns.estruturais.bridge.solution;

public class Alerta extends Mensagem {

    public Alerta(Canal canal) {
        super(canal);
    }

    public void enviar(String destino) {
        canal.enviar(destino, "ALERTA: sua senha foi alterada");
    }
}
