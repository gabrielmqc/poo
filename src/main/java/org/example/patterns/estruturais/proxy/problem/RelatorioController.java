package org.example.patterns.estruturais.proxy.problem;

import java.util.HashMap;
import java.util.Map;

// Controle de acesso + cache + log MISTURADOS com a regra do controller
public class RelatorioController {
    private final ServicoCotacao servico = new ServicoCotacao();
    private final Map<String, Double> cache = new HashMap<>();

    public void exibir(String moeda, String perfil) {
        if (!perfil.equals("admin") && !perfil.equals("financeiro")) {
            throw new SecurityException("Acesso negado ao perfil " + perfil);
        }
        System.out.println("[LOG] consulta " + moeda);
        Double valor = cache.get(moeda);
        if (valor == null) {
            valor = servico.buscar(moeda);
            cache.put(moeda, valor);
        }
        System.out.println(moeda + ": R$ " + valor);
    }
}
