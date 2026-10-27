package org.example.patterns.estruturais.proxy.problem;

// Serviço real: lento e pago por chamada
public class ServicoCotacao {
    static int chamadas = 0;

    double buscar(String moeda) {
        chamadas++;
        System.out.println("[API EXTERNA] Buscando " + moeda + " (lento e pago)...");
        return 5.10;
    }
}
