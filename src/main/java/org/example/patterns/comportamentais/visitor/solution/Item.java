package org.example.patterns.comportamentais.visitor.solution;

// ELEMENT: aceita um visitante
public interface Item {
    double preco();
    <R> R aceitar(Visitante<R> visitante);
}
