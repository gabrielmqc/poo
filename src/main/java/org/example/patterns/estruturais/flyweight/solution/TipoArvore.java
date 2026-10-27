package org.example.patterns.estruturais.flyweight.solution;

// FLYWEIGHT: estado INTRÍNSECO (compartilhado e imutável)
public class TipoArvore {
    private final String nome;
    private final String cor;
    private final Textura textura;

    public TipoArvore(String nome, String cor, String arquivoTextura) {
        this.nome = nome;
        this.cor = cor;
        this.textura = new Textura(arquivoTextura);
    }

    // O estado EXTRÍNSECO (x, y) chega como parâmetro
    void desenhar(int x, int y) {
        System.out.println("Desenhando " + nome + " (" + cor + ", " + textura.arquivo
                + ") em (" + x + ", " + y + ")");
    }
}
