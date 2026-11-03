package org.example.patterns.comportamentais.observer.solution;

// OBSERVER: interface que todo interessado implementa
public interface Observador {
    void atualizar(String produto, int estoque);
}
