package org.example.patterns.comportamentais.visitor.problem;

import java.util.List;

public class VisitorProblema {
    public static void main(String[] args) {
        List<Item> itens = List.of(
                new Livro("Clean Code", 90),
                new Eletronico("Fone", 200),
                new Alimento("Chocolate", 10));

        for (Item i : itens) {
            System.out.println(descrever(i) + " → imposto R$ " + imposto(i));
        }
    }

    // Uma cadeia de instanceof POR operação
    static double imposto(Item i) {
        if (i instanceof Livro)           return 0.0;
        else if (i instanceof Eletronico) return i.preco() * 0.25;
        else if (i instanceof Alimento)   return i.preco() * 0.07;
        throw new IllegalArgumentException("Item desconhecido");
    }

    static String descrever(Item i) {
        if (i instanceof Livro l)           return "Livro: " + l.titulo();
        else if (i instanceof Eletronico e) return "Eletrônico: " + e.nome();
        else if (i instanceof Alimento a)   return "Alimento: " + a.nome();
        throw new IllegalArgumentException("Item desconhecido");
    }
}
