package org.example.patterns.estruturais.decorator.solution;

public class Seguro extends EntregaDecorator {
    Seguro(Entrega e) {
        super(e);
    }

    public double custo() {
        return entrega.custo() + 8.0;
    }

    public String descricao() {
        return entrega.descricao() + " + seguro";
    }
}
