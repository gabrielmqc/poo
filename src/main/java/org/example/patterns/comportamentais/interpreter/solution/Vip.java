package org.example.patterns.comportamentais.interpreter.solution;

// TERMINAL EXPRESSIONS: as condições simples
public record Vip() implements Expressao {
    public boolean interpretar(Cliente c) { return c.vip(); }
}
