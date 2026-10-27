package org.example.patterns.estruturais.flyweight.solution;

import java.util.ArrayList;
import java.util.List;

public class FlyweightSolucao {
    public static void main(String[] args) {
        String[][] tipos = {
                {"Pinheiro", "verde-escuro", "pinheiro.png"},
                {"Carvalho", "verde", "carvalho.png"},
                {"Palmeira", "verde-claro", "palmeira.png"}
        };

        List<Arvore> floresta = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            String[] t = tipos[i % 3];
            TipoArvore tipo = FabricaTipos.obter(t[0], t[1], t[2]);   // reaproveitado
            floresta.add(new Arvore(tipo, i % 1000, i / 1000));
        }

        System.out.printf("Árvores: %d | Tipos criados: %d | Texturas carregadas: %d | Memória simulada: %.1f MB%n",
                floresta.size(), FabricaTipos.total(), Textura.carregadas, Textura.kbTotal / 1024.0);
        // 100000 árvores / 3 tipos / 3 texturas / ≈ 0,6 MB

        floresta.get(0).desenhar();
    }
}
