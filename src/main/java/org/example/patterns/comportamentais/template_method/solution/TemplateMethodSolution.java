package org.example.patterns.comportamentais.template_method.solution;

public class TemplateMethodSolution {
    public static void main(String[] args) {
        new RelatorioCsv().gerar();
        System.out.println();
        new RelatorioHtml().gerar();
    }
}
