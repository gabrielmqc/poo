package org.example.patterns.estruturais.decorator.solution;

public class Expressa extends EntregaDecorator {
    Expressa(Entrega e) {
        super(e);
    }

    public double custo() {
        return entrega.custo() + 20.0;
    }

    public String descricao() {
        return entrega.descricao() + " + expressa";
    }
}
