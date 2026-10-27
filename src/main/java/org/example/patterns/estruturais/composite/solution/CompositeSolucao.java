package org.example.patterns.estruturais.composite.solution;

public class CompositeSolucao {
    public static void main(String[] args) {
        Caixa pequena = new Caixa("Caixa pequena");
        pequena.adicionar(new Produto("Caneta", 5.0));

        Caixa grande = new Caixa("Caixa grande");
        grande.adicionar(new Produto("Caderno", 20.0));
        grande.adicionar(pequena);                       // caixa dentro de caixa

        Kit kit = new Kit("Kit volta às aulas", 0.10);   // tipo novo: 1 classe
        kit.adicionar(new Produto("Mochila", 100.0));
        kit.adicionar(new Produto("Estojo", 30.0));
        grande.adicionar(kit);

        grande.imprimir("");
        System.out.printf("Total: R$ %.2f%n", grande.preco());   // 142.00
    }
}
