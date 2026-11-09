package org.example.patterns.comportamentais.memento.solution;

import java.util.ArrayDeque;
import java.util.Deque;

// CARETAKER: guarda os checkpoints, mas não consegue ler o conteúdo
public class Jogo {
    private final Deque<Personagem.Checkpoint> checkpoints = new ArrayDeque<>();

    void salvar(Personagem p) {
        checkpoints.push(p.salvar());
    }

    void carregarUltimo(Personagem p) {
        if (!checkpoints.isEmpty()) p.restaurar(checkpoints.pop());
    }
}
