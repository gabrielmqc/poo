package org.example.patterns.criacionais.prototype.problem;

import java.util.ArrayList;
import java.util.List;

public class PrototypeProblema {
    // Copiar "na mão": o cliente precisa conhecer todos os campos
    static Inimigo copiar(Inimigo original) {
        Inimigo novo = new Inimigo(original.tipo);     // relê o disco de novo
        novo.vida = original.vida;
        novo.velocidade = original.velocidade;
        novo.habilidades = new ArrayList<>(original.habilidades);
        // Se Inimigo ganhar um atributo novo, esta função fica desatualizada em silêncio
        return novo;
    }

    public static void main(String[] args) {
        List<Inimigo> horda = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            horda.add(new Inimigo("orc"));
        }
        System.out.println("Leituras de disco: " + Inimigo.leiturasDeDisco);  // 500

        Inimigo copia = copiar(horda.get(0));
        System.out.println("Após uma cópia manual: " + Inimigo.leiturasDeDisco); // 501
    }
}
