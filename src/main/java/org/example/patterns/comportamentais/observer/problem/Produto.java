package org.example.patterns.comportamentais.observer.problem;

public class Produto {
    private final String nome;
    private int estoque = 0;

    // Produto conhece e cria TODOS os interessados
    private final NotificadorEmail email = new NotificadorEmail();
    private final NotificadorPush push = new NotificadorPush();
    private final PainelCompras painel = new PainelCompras();

    Produto(String nome) {
        this.nome = nome;
    }

    void repor(int qtd) {
        boolean estavaEsgotado = estoque == 0;
        estoque += qtd;
        if (estavaEsgotado && estoque > 0) {
            email.avisar(nome);
            push.avisar(nome);
            painel.atualizar(nome);
            // amanhã: whatsapp.avisar(nome); erp.sincronizar(nome); ...
        }
    }
}
