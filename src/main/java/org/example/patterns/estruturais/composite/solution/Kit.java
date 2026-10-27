package org.example.patterns.estruturais.composite.solution;

// Novo tipo: só uma classe, sem alterar nada existente
public class Kit extends Caixa {
    private final double desconto;

    public Kit(String nome, double desconto) {
        super(nome);
        this.desconto = desconto;
    }

    @Override
    public double preco() {
        return super.preco() * (1 - desconto);
    }
}
