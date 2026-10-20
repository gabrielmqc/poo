package org.example.patterns.abstract_factory.solution;

import org.example.patterns.abstract_factory.solution.buttons.BotaoMac;
import org.example.patterns.abstract_factory.solution.checkboxes.CheckboxMac;
import org.example.patterns.abstract_factory.solution.produtos.IBotao;
import org.example.patterns.abstract_factory.solution.produtos.ICheckbox;

public class FabricaMac implements FabricaGUI{
    public IBotao criarBotao(String texto) { return new BotaoMac(texto); }
    public ICheckbox criarCheckbox(String texto) { return new CheckboxMac(texto); }
}
