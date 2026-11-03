package org.example.patterns.comportamentais.template_method.problem;

import java.util.List;

public class RelatorioHtml {
    void gerar() {
        // esqueceram o log de início (copiaram e colaram e perderam um passo)
        List<String[]> dados = List.of(new String[]{"Ana", "100"}, new String[]{"Bia", "250"});
        System.out.println("<table>");
        for (String[] l : dados) System.out.println("<tr><td>" + l[0] + "</td><td>" + l[1] + "</td></tr>");
        System.out.println("</table>");
        System.out.println("[LOG] Fim do relatório");
    }
}
