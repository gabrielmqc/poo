package org.example.patterns.comportamentais.template_method.problem;

import java.util.List;

public class RelatorioCsv {
    void gerar() {
        System.out.println("[LOG] Início do relatório");
        List<String[]> dados = List.of(new String[]{"Ana", "100"}, new String[]{"Bia", "250"});
        System.out.println("nome;valor");
        for (String[] l : dados) System.out.println(l[0] + ";" + l[1]);
        System.out.println("[LOG] Fim do relatório");
    }
}
