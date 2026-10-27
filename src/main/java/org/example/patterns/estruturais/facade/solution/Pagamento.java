package org.example.patterns.estruturais.facade.solution;

public class Pagamento {
    boolean cobrar(String cartao, double valor) { System.out.println("Pagamento: R$ " + valor); return true; }

}
