package org.example.patterns.estruturais.bridge.problem;

public class PromocaoEmail extends Mensagem {
    void enviar(String destino) {
        System.out.println("[E-MAIL] " + destino + ": PROMOÇÃO: 20% de desconto hoje");
    }
}
