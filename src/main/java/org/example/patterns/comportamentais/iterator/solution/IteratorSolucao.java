package org.example.patterns.comportamentais.iterator.solution;

public class IteratorSolucao {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        catalogo.adicionar("Livros", new Produto("Clean Code", 90));
        catalogo.adicionar("Livros", new Produto("Refactoring", 110));
        catalogo.adicionar("Eletrônicos", new Produto("Fone", 200));

        // O cliente usa um for-each simples, sem saber como o catálogo é organizado
        for (Produto p : catalogo) {
            System.out.println(p.nome() + " (R$ " + p.preco() + ")");
        }
    }
}
