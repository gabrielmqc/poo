package org.example.patterns.estruturais.composite.solution;

// LEAF: elemento simples
public class Produto implements Item {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double preco() {
        return preco;
    }

    public void imprimir(String recuo) {
        System.out.printf("%s- %s (R$ %.2f)%n", recuo, nome, preco);
    }
}
