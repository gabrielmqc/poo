package org.example.patterns.estruturais.adapter.solution;

public class PagRapido {

    static class Resposta {
        final String status;
        Resposta(String status) { this.status = status; }
    }

    public Resposta cobrar(String cartao, double valorEmReais, String moeda) {
        System.out.println("[PagRapido] Cobrando " + valorEmReais + " " + moeda);
        return new Resposta("APROVADO");
    }

}
