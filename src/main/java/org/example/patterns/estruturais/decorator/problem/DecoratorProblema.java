package org.example.patterns.estruturais.decorator.problem;

public class DecoratorProblema {
    public static void main(String[] args) {
        Entrega e1 = new Entrega(true, false, true);    // presente + expressa
        Entrega e2 = new Entrega(false, true, false);   // só seguro

        System.out.println(e1.descricao() + " = R$ " + e1.custo());
        System.out.println(e2.descricao() + " = R$ " + e2.custo());
    }
}
