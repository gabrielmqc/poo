package org.example.patterns.comportamentais.interpreter.solution;

// NONTERMINAL EXPRESSIONS: combinam outras expressões
public record E(Expressao esquerda, Expressao direita) implements Expressao {
    public boolean interpretar(Cliente c) { return esquerda.interpretar(c) && direita.interpretar(c); }
}
