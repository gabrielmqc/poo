package org.example.patterns.comportamentais.chain_of_responsability.solution;

// HANDLER: guarda o próximo elo e define o fluxo
public abstract class Aprovador {
    private Aprovador proximo;

    Aprovador definirProximo(Aprovador proximo) {
        this.proximo = proximo;
        return proximo;                      // permite encadear a montagem
    }

    String aprovar(double percentual) {
        if (podeAprovar(percentual)) {
            return nome() + " aprovou " + percentual + "%";
        }
        if (proximo != null) {
            return proximo.aprovar(percentual);   // passa adiante
        }
        return "Desconto de " + percentual + "% recusado: ninguém na cadeia pôde aprovar";
    }

    protected abstract boolean podeAprovar(double percentual);

    protected abstract String nome();
}
