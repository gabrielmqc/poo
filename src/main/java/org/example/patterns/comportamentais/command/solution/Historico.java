package org.example.patterns.comportamentais.command.solution;

import java.util.ArrayDeque;
import java.util.Deque;

// INVOKER: executa e guarda o histórico
public class Historico {
    private final Deque<Comando> pilha = new ArrayDeque<>();

    void executar(Comando c) {
        c.executar();
        pilha.push(c);
    }

    void desfazer() {
        if (!pilha.isEmpty()) pilha.pop().desfazer();
    }
}
