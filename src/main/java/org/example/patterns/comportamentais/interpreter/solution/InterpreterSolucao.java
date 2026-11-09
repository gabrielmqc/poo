package org.example.patterns.comportamentais.interpreter.solution;

public class InterpreterSolucao {
    public static void main(String[] args) {
        Cliente ana = new Cliente(true, 120, "BR");
        Cliente bia = new Cliente(true, 800, "US");
        Cliente caio = new Cliente(false, 900, "BR");

        // vip E (pais == BR OU total > 500): a regra é uma ÁRVORE de objetos
        Expressao regra = new E(
                new Vip(),
                new Ou(new PaisIgual("BR"), new TotalMaiorQue(500)));

        System.out.println("Ana: " + regra.interpretar(ana));     // true
        System.out.println("Bia: " + regra.interpretar(bia));     // true
        System.out.println("Caio: " + regra.interpretar(caio));   // false

        // Outra regra, montada sem recompilar nada: NÃO VIP e total > 800
        Expressao outra = new E(new Nao(new Vip()), new TotalMaiorQue(800));
        System.out.println("Caio (outra regra): " + outra.interpretar(caio));   // true
    }
}
