package org.example.patterns.comportamentais.interpreter.solution;

// ABSTRACT EXPRESSION
public interface Expressao {
    boolean interpretar(Cliente contexto);
}