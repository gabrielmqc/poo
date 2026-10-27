package org.example.patterns.estruturais.proxy.problem;

// Outro ponto do sistema: esqueceu o cache, o acesso e o log
public class DashboardController {
    private final ServicoCotacao servico = new ServicoCotacao();

    void exibir(String moeda) {
        System.out.println(moeda + ": R$ " + servico.buscar(moeda));
    }
}
