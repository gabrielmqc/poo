package org.example.patterns.estruturais.proxy.solution;

// REAL SUBJECT: o serviço caro
public class CotacaoReal implements Cotacao {
    static int chamadas = 0;

    public double buscar(String moeda) {
        chamadas++;
        System.out.println("[API EXTERNA] Buscando " + moeda + " (lento e pago)...");
        return moeda.equals("USD") ? 5.10 : 5.60;
    }
}
