package org.example.patterns.estruturais.proxy.solution;

public class ProxySolucao {
    public static void main(String[] args) {
        Cotacao cotacao = new CotacaoProxy(new CotacaoReal(), "admin");

        System.out.println("USD: R$ " + cotacao.buscar("USD"));
        System.out.println("USD: R$ " + cotacao.buscar("USD"));   // vem do cache
        System.out.println("EUR: R$ " + cotacao.buscar("EUR"));

        System.out.println("Chamadas à API externa: " + CotacaoReal.chamadas);   // 2

        try {
            new CotacaoProxy(new CotacaoReal(), "estagiario").buscar("USD");
        } catch (SecurityException e) {
            System.out.println("Bloqueado: " + e.getMessage());
        }
    }
}
