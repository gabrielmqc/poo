package org.example.patterns.estruturais.bridge.solution;

public class Lembrete extends Mensagem {
    public Lembrete(Canal canal) {
        super(canal);
    }

    public void enviar(String destino) {
        canal.enviar(destino, "LEMBRETE: seu pedido sai amanhã");
    }
}
