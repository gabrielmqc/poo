package org.example.patterns.comportamentais.template_method.problem;

public class TemplateMethodProblema {
    public static void main(String[] args) {
        new RelatorioCsv().gerar();
        new RelatorioHtml().gerar();
    }
}
