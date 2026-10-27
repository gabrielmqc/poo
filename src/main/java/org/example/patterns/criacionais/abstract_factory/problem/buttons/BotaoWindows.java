package org.example.patterns.criacionais.abstract_factory.problem.buttons;

import org.example.patterns.criacionais.abstract_factory.problem.produtos.Componente;

public class BotaoWindows implements Componente {
    private final String texto;
    public BotaoWindows(String texto) { this.texto = texto; }
    public void desenhar() { System.out.println("[Win] Botão '" + texto + "'"); }
}
