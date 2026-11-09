package org.example.patterns.comportamentais.iterator.problem;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Catalogo {
    // Estrutura interna exposta para o mundo
    final Map<String, List<Produto>> categorias = new LinkedHashMap<>();

    void adicionar(String categoria, Produto produto) {
        categorias.computeIfAbsent(categoria, c -> new ArrayList<>()).add(produto);
    }

}
