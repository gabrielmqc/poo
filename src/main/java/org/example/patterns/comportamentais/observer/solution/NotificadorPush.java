package org.example.patterns.comportamentais.observer.solution;

public class NotificadorPush implements Observador {
    public void atualizar(String produto, int estoque) {
        System.out.println("[PUSH] " + produto + " voltou ao estoque");
    }
}