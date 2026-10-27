package org.example.patterns.estruturais.proxy.solution;

import java.util.HashMap;
import java.util.Map;

// PROXY: mesma interface, controla o acesso ao serviço real
public class CotacaoProxy implements Cotacao {
    private final Cotacao real;
    private final String perfil;
    private final Map<String, Double> cache = new HashMap<>();

    CotacaoProxy(Cotacao real, String perfil) {
        this.real = real;
        this.perfil = perfil;
    }

    public double buscar(String moeda) {
        // 1) proteção
        if (!perfil.equals("admin") && !perfil.equals("financeiro")) {
            throw new SecurityException("Acesso negado ao perfil " + perfil);
        }
        // 2) log
        System.out.println("[LOG] consulta " + moeda);
        // 3) cache: só chama o serviço real se necessário
        return cache.computeIfAbsent(moeda, real::buscar);
    }
}
