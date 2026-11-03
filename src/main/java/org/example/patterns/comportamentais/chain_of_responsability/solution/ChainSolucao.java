package org.example.patterns.comportamentais.chain_of_responsability.solution;

public class ChainSolucao {
    public static void main(String[] args) {
        Aprovador cadeia = new Atendente();
        cadeia.definirProximo(new Gerente())
                .definirProximo(new Diretor());

        System.out.println(cadeia.aprovar(3));    // Atendente
        System.out.println(cadeia.aprovar(12));   // Gerente
        System.out.println(cadeia.aprovar(25));   // Diretor
        System.out.println(cadeia.aprovar(40));   // ninguém
    }
}
