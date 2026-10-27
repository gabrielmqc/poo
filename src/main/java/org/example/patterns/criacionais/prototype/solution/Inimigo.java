package org.example.patterns.criacionais.prototype.solution;

import java.util.ArrayList;
import java.util.List;

public class Inimigo implements Prototipo<Inimigo> {
    static int leiturasDeDisco = 0;

    private final String tipo;
    private final Sprite sprite;            // pesado e imutável: compartilhado
    private int vida;
    private double velocidade;
    private List<String> habilidades;       // mutável: cada clone tem a sua
    int x, y;

    public Inimigo(String tipo, Sprite sprite, int vida, double velocidade, List<String> habilidades) {
        this.tipo = tipo;
        this.sprite = sprite;
        this.vida = vida;
        this.velocidade = velocidade;
        this.habilidades = habilidades;
    }

    // Construtor de cópia: o próprio objeto conhece seus campos (inclusive privados)
    private Inimigo(Inimigo original) {
        this.tipo = original.tipo;
        this.sprite = original.sprite;                                  // cópia rasa
        this.vida = original.vida;
        this.velocidade = original.velocidade;
        this.habilidades = new ArrayList<>(original.habilidades);       // cópia profunda
        this.x = original.x;
        this.y = original.y;
    }

    @Override
    public Inimigo clonar() {
        return new Inimigo(this);
    }

    public static Sprite carregarSpriteDoDisco(String arquivo) {
        leiturasDeDisco++;
        return new Sprite(arquivo);
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public String getTipo() {
        return tipo;
    }
}
