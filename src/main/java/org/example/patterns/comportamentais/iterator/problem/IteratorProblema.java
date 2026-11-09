package org.example.patterns.comportamentais.iterator.problem;

import java.util.List;
import java.util.Map;

public class IteratorProblema {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        catalogo.adicionar("Livros", new Produto("Clean Code", 90));
        catalogo.adicionar("Livros", new Produto("Refactoring", 110));
        catalogo.adicionar("Eletrônicos", new Produto("Fone", 200));

        // O cliente precisa conhecer a ESTRUTURA INTERNA (mapa de listas)
        for (Map.Entry<String, List<Produto>> entrada : catalogo.categorias.entrySet()) {
            for (Produto p : entrada.getValue()) {
                System.out.println(entrada.getKey() + ": " + p.nome() + " (R$ " + p.preco() + ")");
            }
        }
    }
}
