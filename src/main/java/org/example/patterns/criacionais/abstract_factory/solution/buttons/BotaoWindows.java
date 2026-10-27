package org.example.patterns.criacionais.abstract_factory.solution.buttons;

import org.example.patterns.criacionais.abstract_factory.solution.produtos.IBotao;

public class BotaoWindows implements IBotao {
    private final String texto;

    public BotaoWindows(String texto) {
        this.texto = texto;
    }

    public void desenhar() {
        System.out.println("[Win] Botão '" + texto + "'");
    }
}
