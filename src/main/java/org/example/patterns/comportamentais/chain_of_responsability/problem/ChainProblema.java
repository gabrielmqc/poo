package org.example.patterns.comportamentais.chain_of_responsability.problem;

public class ChainProblema {
    public static void main(String[] args) {
        PoliticaDesconto politica = new PoliticaDesconto();
        System.out.println(politica.aprovar(3));
        System.out.println(politica.aprovar(12));
        System.out.println(politica.aprovar(25));
        System.out.println(politica.aprovar(40));
    }
}
