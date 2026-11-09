package org.example.patterns.comportamentais.iterator.solution;

import java.util.*;

// AGGREGATE: implementa Iterable e cria o iterador
public class Catalogo implements Iterable<Produto> {
    private final Map<String, List<Produto>> categorias = new LinkedHashMap<>();   // agora privado

    void adicionar(String categoria, Produto produto) {
        categorias.computeIfAbsent(categoria, c -> new ArrayList<>()).add(produto);
    }

    // CONCRETE ITERATOR: percorre as categorias "achatando" as listas
    @Override
    public Iterator<Produto> iterator() {
        Iterator<List<Produto>> externo = categorias.values().iterator();

        return new Iterator<>() {
            private Iterator<Produto> interno = Collections.emptyIterator();

            @Override
            public boolean hasNext() {
                while (!interno.hasNext() && externo.hasNext()) {
                    interno = externo.next().iterator();
                }
                return interno.hasNext();
            }

            @Override
            public Produto next() {
                if (!hasNext()) throw new NoSuchElementException();
                return interno.next();
            }
        };
    }
}