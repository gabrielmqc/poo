package org.example.patterns.estruturais.flyweight.problem;

import java.util.ArrayList;
import java.util.List;

public class FlyweightProblema {
    public static void main(String[] args) {
        String[][] tipos = {
                {"Pinheiro", "verde-escuro", "pinheiro.png"},
                {"Carvalho", "verde", "carvalho.png"},
                {"Palmeira", "verde-claro", "palmeira.png"}
        };

        List<Arvore> floresta = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            String[] t = tipos[i % 3];
            floresta.add(new Arvore(t[0], t[1], t[2], i % 1000, i / 1000));
        }

        System.out.printf("Árvores: %d | Texturas carregadas: %d | Memória simulada: %.0f MB%n",
                floresta.size(), Textura.carregadas, Textura.kbTotal / 1024.0);
        // ≈ 100000 texturas / ≈ 19531 MB
    }
}
