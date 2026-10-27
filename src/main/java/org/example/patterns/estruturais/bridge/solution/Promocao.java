package org.example.patterns.estruturais.bridge.solution;

public class Promocao extends Mensagem {
    public Promocao(Canal canal) {
        super(canal);
    }

    public void enviar(String destino) {
        canal.enviar(destino, "PROMOÇÃO: 20% de desconto hoje");
    }
}
