package org.example.patterns.abstract_factory.problem.checkboxes;

import org.example.patterns.abstract_factory.problem.produtos.Componente;

public class CheckboxWindows implements Componente {
    private final String texto;
    public CheckboxWindows(String texto) { this.texto = texto; }
    public void desenhar() { System.out.println("[Win] Checkbox '" + texto + "'"); }
}
