package org.example.patterns.estruturais.composite.solution;

import java.util.ArrayList;
import java.util.List;

// COMPOSITE: guarda filhos do tipo Item (folhas OU outros compostos)
public class Caixa implements Item {
    private final String nome;
    private final List<Item> itens = new ArrayList<>();

    public Caixa(String nome) {
        this.nome = nome;
    }

    public void adicionar(Item item) {
        itens.add(item);
    }

    public double preco() {
        return itens.stream().mapToDouble(Item::preco).sum();   // recursão via polimorfismo
    }

    public void imprimir(String recuo) {
        System.out.printf("%s+ %s (R$ %.2f)%n", recuo, nome, preco());
        for (Item i : itens) i.imprimir(recuo + "    ");
    }
}
