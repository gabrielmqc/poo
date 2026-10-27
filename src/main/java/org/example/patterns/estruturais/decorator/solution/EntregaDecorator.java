package org.example.patterns.estruturais.decorator.solution;

// DECORATOR base: implementa a MESMA interface e guarda um Entrega
public abstract class EntregaDecorator implements Entrega {
    protected final Entrega entrega;

    protected EntregaDecorator(Entrega entrega) {
        this.entrega = entrega;
    }
}
