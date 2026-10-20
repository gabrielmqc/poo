package org.example.patterns.abstract_factory.solution.buttons;

import org.example.patterns.abstract_factory.solution.produtos.IBotao;

public class BotaoMac implements IBotao {
    private final String texto;

    public BotaoMac(String texto) {
        this.texto = texto;
    }

    public void desenhar() {
        System.out.println("[Mac] Botão '" + texto + "'");
    }
}
