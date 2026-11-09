package org.example.patterns.comportamentais.interpreter.solution;

// TERMINAL EXPRESSIONS: as condições simples
public record PaisIgual(String pais) implements Expressao {
    public boolean interpretar(Cliente c) { return c.pais().equals(pais); }
}
