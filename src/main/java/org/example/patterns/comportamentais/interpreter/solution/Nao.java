package org.example.patterns.comportamentais.interpreter.solution;

// NONTERMINAL EXPRESSIONS: combinam outras expressões
public record Nao(Expressao expressao) implements Expressao {
    public boolean interpretar(Cliente c) { return !expressao.interpretar(c); }
}
