package org.example.patterns.estruturais.decorator.solution;

// CONCRETE COMPONENT
public class EntregaBasica implements Entrega {
    public double custo() {
        return 10.0;
    }

    public String descricao() {
        return "Entrega padrão";
    }
}
