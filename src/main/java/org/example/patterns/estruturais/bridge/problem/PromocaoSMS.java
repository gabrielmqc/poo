package org.example.patterns.estruturais.bridge.problem;

public class PromocaoSMS extends Mensagem {
    public void enviar(String destino) {
        System.out.println("[SMS] " + destino + ": PROMOÇÃO: 20% de desconto hoje");
    }
}
