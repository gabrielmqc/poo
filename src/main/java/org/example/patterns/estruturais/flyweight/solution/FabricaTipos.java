package org.example.patterns.estruturais.flyweight.solution;

import java.util.HashMap;
import java.util.Map;

// FLYWEIGHT FACTORY: garante o compartilhamento
public class FabricaTipos {
    private static final Map<String, TipoArvore> cache = new HashMap<>();

    static TipoArvore obter(String nome, String cor, String arquivoTextura) {
        return cache.computeIfAbsent(nome, n -> new TipoArvore(nome, cor, arquivoTextura));
    }

    static int total() {
        return cache.size();
    }
}
