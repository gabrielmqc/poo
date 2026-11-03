package org.example.patterns.comportamentais.chain_of_responsability.solution;

// CONCRETE HANDLERS: cada um conhece só a própria regra
public class Atendente extends Aprovador {
    protected boolean podeAprovar(double p) {
        return p <= 5;
    }

    protected String nome() {
        return "Atendente";
    }
}
