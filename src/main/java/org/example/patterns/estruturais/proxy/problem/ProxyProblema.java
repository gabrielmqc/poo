package org.example.patterns.estruturais.proxy.problem;

public class ProxyProblema {
    public static void main(String[] args) {
        RelatorioController relatorio = new RelatorioController();
        relatorio.exibir("USD", "admin");
        relatorio.exibir("USD", "admin");               // usa o cache local

        new DashboardController().exibir("USD");        // sem cache, sem acesso, sem log

        System.out.println("Chamadas à API externa: " + ServicoCotacao.chamadas);   // 2
    }
}
