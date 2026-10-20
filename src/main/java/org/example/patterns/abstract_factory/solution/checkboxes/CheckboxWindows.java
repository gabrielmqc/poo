package org.example.patterns.abstract_factory.solution.checkboxes;

import org.example.patterns.abstract_factory.solution.produtos.ICheckbox;

public class CheckboxWindows implements ICheckbox {
    private final String texto;

    public CheckboxWindows(String texto) {
        this.texto = texto;
    }

    public void desenhar() {
        System.out.println("[Win] Checkbox '" + texto + "'");
    }
}
