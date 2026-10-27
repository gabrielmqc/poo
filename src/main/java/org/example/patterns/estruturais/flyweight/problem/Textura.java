package org.example.patterns.estruturais.flyweight.problem;

public class Textura {
    static int carregadas = 0;
    static long kbTotal = 0;
    final String arquivo;

    public Textura(String arquivo) {
        this.arquivo = arquivo;
        carregadas++;
        kbTotal += 200;           // simula 200 KB de pixels por textura
    }
}
