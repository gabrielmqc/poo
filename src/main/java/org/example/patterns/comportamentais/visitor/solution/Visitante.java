package org.example.patterns.comportamentais.visitor.solution;

// VISITOR: um método "visitar" para cada tipo concreto de elemento
public interface Visitante<R> {
    R visitar(Livro livro);
    R visitar(Eletronico eletronico);
    R visitar(Alimento alimento);
}