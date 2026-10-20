package org.example.patterns.abstract_factory.problem.checkboxes;

import org.example.patterns.abstract_factory.problem.produtos.Componente;

public class CheckboxMac implements Componente {
    private final String texto;
    public CheckboxMac(String texto) { this.texto = texto; }
    public void desenhar() { System.out.println("[Mac] Checkbox '" + texto + "'"); }
}
