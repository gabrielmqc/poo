package org.example.patterns.estruturais.flyweight.solution;

public class Textura {
    static int carregadas = 0;
    static long kbTotal = 0;
    final String arquivo;

    public Textura(String arquivo) {
        this.arquivo = arquivo;
        carregadas++;
        kbTotal += 200;
    }
}
