package org.example.patterns.comportamentais.memento.problem;

import java.util.ArrayList;
import java.util.List;

// O Jogo copia campo por campo
public class Jogo {
    private int vidaSalva;
    private int faseSalva;
    private List<String> inventarioSalvo;

    void salvar(Personagem p) {
        vidaSalva = p.vida;
        faseSalva = p.fase;
        inventarioSalvo = new ArrayList<>(p.inventario);
    }

    void carregar(Personagem p) {
        p.vida = vidaSalva;
        p.fase = faseSalva;
        p.inventario = new ArrayList<>(inventarioSalvo);
    }
}
