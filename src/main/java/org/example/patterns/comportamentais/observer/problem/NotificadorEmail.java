package org.example.patterns.comportamentais.observer.problem;

public class NotificadorEmail {
    void avisar(String produto) {
        System.out.println("[E-MAIL] " + produto + " voltou ao estoque");
    }
}
