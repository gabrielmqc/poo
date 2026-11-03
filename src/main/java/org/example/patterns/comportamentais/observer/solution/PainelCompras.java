package org.example.patterns.comportamentais.observer.solution;

public class PainelCompras implements Observador {
    public void atualizar(String produto, int estoque) {
        System.out.println("[PAINEL] Reposição de " + produto + ": " + estoque + " un.");
    }
}
