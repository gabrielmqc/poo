package org.example.patterns.comportamentais.visitor.solution;

// CONCRETE ELEMENTS: cada um se "apresenta" ao visitante (double dispatch)
public record Livro(String titulo, double preco) implements Item {
    public <R> R aceitar(Visitante<R> v) { return v.visitar(this); }
}
