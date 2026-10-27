package org.example.patterns.estruturais.facade.solution;

public class NotaFiscal {
    String emitir(String cliente, double total) {
        System.out.println("NF emitida");
        return "NF-001";
    }
}
