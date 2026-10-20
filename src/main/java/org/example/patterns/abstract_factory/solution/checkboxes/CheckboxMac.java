package org.example.patterns.abstract_factory.solution.checkboxes;

import org.example.patterns.abstract_factory.solution.produtos.ICheckbox;

public class CheckboxMac implements ICheckbox {
    private final String texto;

    public CheckboxMac(String texto) {
        this.texto = texto;
    }

    public void desenhar() {
        System.out.println("[Mac] Checkbox '" + texto + "'");
    }
}
