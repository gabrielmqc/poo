package org.example.patterns.estruturais.flyweight.problem;

public class Arvore {
    final String nome;            // repetido em milhares de objetos
    final String cor;             // repetido
    final Textura textura;        // repetido e PESADO
    final int x, y;               // o único dado realmente diferente

    public Arvore(String nome, String cor, String arquivoTextura, int x, int y) {
        this.nome = nome;
        this.cor = cor;
        this.textura = new Textura(arquivoTextura);    // carrega de novo a cada árvore
        this.x = x;
        this.y = y;
    }
}
