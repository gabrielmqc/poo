package org.example.patterns.estruturais.decorator.solution;

// CONCRETE DECORATORS: cada um soma uma responsabilidade
public class Presente extends EntregaDecorator {
    Presente(Entrega e) {
        super(e);
    }

    public double custo() {
        return entrega.custo() + 5.0;
    }

    public String descricao() {
        return entrega.descricao() + " + presente";
    }
}
