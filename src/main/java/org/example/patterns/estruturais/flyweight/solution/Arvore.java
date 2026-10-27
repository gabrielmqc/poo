package org.example.patterns.estruturais.flyweight.solution;

// CONTEXTO: guarda só o estado EXTRÍNSECO + referência ao flyweight
public class Arvore {
    private final TipoArvore tipo;
    private final int x, y;

    public Arvore(TipoArvore tipo, int x, int y) {
        this.tipo = tipo;
        this.x = x;
        this.y = y;
    }

    public void desenhar() {
        tipo.desenhar(x, y);
    }
}
