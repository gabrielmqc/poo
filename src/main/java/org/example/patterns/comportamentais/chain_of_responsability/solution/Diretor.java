package org.example.patterns.comportamentais.chain_of_responsability.solution;

// CONCRETE HANDLERS: cada um conhece só a própria regra
public class Diretor extends Aprovador {
    protected boolean podeAprovar(double p) {
        return p <= 30;
    }

    protected String nome() {
        return "Diretor";
    }
}
