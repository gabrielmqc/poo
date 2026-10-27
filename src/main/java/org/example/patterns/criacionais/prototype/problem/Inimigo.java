package org.example.patterns.criacionais.prototype.problem;

import java.util.ArrayList;
import java.util.List;

public class Inimigo {
    static int leiturasDeDisco = 0;

    String tipo;
    Sprite sprite;
    int vida;
    double velocidade;
    List<String> habilidades;
    int x, y;

    public Inimigo(String tipo) {
        this.tipo = tipo;
        this.sprite = carregarSpriteDoDisco(tipo + ".png");   // operação lenta
        this.vida = 100;
        this.velocidade = 1.5;
        this.habilidades = new ArrayList<>(List.of("ataque", "defesa"));
    }

    public static Sprite carregarSpriteDoDisco(String arquivo) {
        leiturasDeDisco++;
        return new Sprite(arquivo);
    }
}
