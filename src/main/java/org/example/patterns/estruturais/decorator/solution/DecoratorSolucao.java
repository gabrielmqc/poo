package org.example.patterns.estruturais.decorator.solution;

public class DecoratorSolucao {
    public static void main(String[] args) {
        // Empilha só o que o cliente escolheu
        Entrega e1 = new Expressa(new Presente(new EntregaBasica()));
        Entrega e2 = new Seguro(new EntregaBasica());
        Entrega e3 = new Rastreamento(new Seguro(new Expressa(new EntregaBasica())));

        imprimir(e1);
        imprimir(e2);
        imprimir(e3);
    }

    static void imprimir(Entrega e) {
        System.out.printf("%s = R$ %.2f%n", e.descricao(), e.custo());
    }
}
