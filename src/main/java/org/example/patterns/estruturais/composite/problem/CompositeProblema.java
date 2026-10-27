package org.example.patterns.estruturais.composite.problem;

public class CompositeProblema {
    public static void main(String[] args) {
        Produto caneta = new Produto("Caneta", 5.0);
        Produto caderno = new Produto("Caderno", 20.0);

        Caixa pequena = new Caixa();
        pequena.produtos.add(caneta);

        Caixa grande = new Caixa();
        grande.produtos.add(caderno);
        grande.caixas.add(pequena);

        System.out.println("Total: R$ " + total(grande));   // 25.0
    }

    // O cliente precisa saber o TIPO de cada elemento
    static double total(Object item) {
        if (item instanceof Produto p) {
            return p.preco;
        }
        if (item instanceof Caixa c) {
            double soma = 0;
            for (Produto p : c.produtos) soma += p.preco;
            for (Caixa sub : c.caixas) soma += total(sub);
            return soma;
        }
        // Novo requisito (KitPromocional): mais um "if" aqui, mais uma lista em Caixa,
        // e o mesmo "if" em CADA operação (peso, descrição, impressão...)
        throw new IllegalArgumentException("Tipo desconhecido");
    }
}
