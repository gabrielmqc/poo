package org.example.patterns.comportamentais.observer.solution;

public class NotificadorEmail implements Observador {
    public void atualizar(String produto, int estoque) {
        System.out.println("[E-MAIL] " + produto + " voltou ao estoque (" + estoque + ")");
    }
}