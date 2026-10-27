package org.example.patterns.estruturais.decorator.solution;

// Adicional novo: 1 classe, sem alterar nenhuma existente
public class Rastreamento extends EntregaDecorator {
    public Rastreamento(Entrega e) {
        super(e);
    }

    public double custo() {
        return entrega.custo() + 3.5;
    }

    public String descricao() {
        return entrega.descricao() + " + rastreamento";
    }
}
