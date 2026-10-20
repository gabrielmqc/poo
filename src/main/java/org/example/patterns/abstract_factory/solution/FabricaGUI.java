package org.example.patterns.abstract_factory.solution;

import org.example.patterns.abstract_factory.solution.produtos.IBotao;
import org.example.patterns.abstract_factory.solution.produtos.ICheckbox;

public interface FabricaGUI {
    IBotao criarBotao(String texto);
    ICheckbox criarCheckbox(String texto);
}
