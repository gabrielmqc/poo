package org.example.patterns.abstract_factory.solution;

import org.example.patterns.abstract_factory.solution.buttons.BotaoWindows;
import org.example.patterns.abstract_factory.solution.checkboxes.CheckboxWindows;
import org.example.patterns.abstract_factory.solution.produtos.IBotao;
import org.example.patterns.abstract_factory.solution.produtos.ICheckbox;

public class FabricaWindows implements FabricaGUI{
    public IBotao criarBotao(String texto) { return new BotaoWindows(texto); }
    public ICheckbox criarCheckbox(String texto) { return new CheckboxWindows(texto); }
}
