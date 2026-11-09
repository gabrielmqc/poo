package org.example.patterns.comportamentais.visitor.solution;

import java.util.List;

public class VisitorSolucao {
    public static void main(String[] args) {
        List<Item> itens = List.of(
                new Livro("Clean Code", 90),
                new Eletronico("Fone", 200),
                new Alimento("Chocolate", 10));

        Visitante<Double> calculadora = new CalculadoraImposto();
        Visitante<String> descritor = new Descritor();

        for (Item i : itens) {
            System.out.println(i.aceitar(descritor) + " → imposto R$ " + i.aceitar(calculadora));
        }
    }
}
