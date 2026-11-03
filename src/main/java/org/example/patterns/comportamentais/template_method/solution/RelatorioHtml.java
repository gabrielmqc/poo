package org.example.patterns.comportamentais.template_method.solution;

public class RelatorioHtml extends Relatorio {
    protected void abrir() {
        System.out.println("<table>");
    }

    protected void escreverLinha(String[] c) {
        System.out.println("<tr><td>" + c[0] + "</td><td>" + c[1] + "</td></tr>");
    }

    protected void fechar() {
        System.out.println("</table>");
    }

    @Override
    protected void rodape() {
        System.out.println("<!-- gerado automaticamente -->");
    }
}