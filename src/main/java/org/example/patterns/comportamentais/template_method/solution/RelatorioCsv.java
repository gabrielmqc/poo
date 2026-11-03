package org.example.patterns.comportamentais.template_method.solution;

public class RelatorioCsv extends Relatorio {
    protected void abrir() {
        System.out.println("nome;valor");
    }

    protected void escreverLinha(String[] c) {
        System.out.println(c[0] + ";" + c[1]);
    }

    protected void fechar() {
    }
}
