package org.example.patterns.comportamentais.interpreter.solution;

// TERMINAL EXPRESSIONS: as condições simples
public record TotalMaiorQue(double limite) implements Expressao {
    public boolean interpretar(Cliente c) { return c.total() > limite; }
}

