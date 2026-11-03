package org.example.patterns.comportamentais.observer.solution;

import java.util.ArrayList;
import java.util.List;

// SUBJECT: guarda a lista de observadores e os avisa
public class Produto {
    private final String nome;
    private int estoque = 0;
    private final List<Observador> observadores = new ArrayList<>();

    Produto(String nome) {
        this.nome = nome;
    }

    void inscrever(Observador o) {
        observadores.add(o);
    }

    void cancelar(Observador o) {
        observadores.remove(o);
    }

    private void notificar() {
        for (Observador o : observadores) o.atualizar(nome, estoque);
    }

    void repor(int qtd) {
        boolean estavaEsgotado = estoque == 0;
        estoque += qtd;
        if (estavaEsgotado && estoque > 0) notificar();
    }

    void vender(int qtd) {
        estoque -= qtd;
    }
}
