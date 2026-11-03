package org.example.patterns.comportamentais.template_method.solution;

import java.util.List;

public abstract class Relatorio {

    // TEMPLATE METHOD: define o esqueleto. "final" impede que subclasses mudem a ordem
    public final void gerar() {
        System.out.println("[LOG] Início do relatório");
        List<String[]> dados = buscarDados();
        abrir();
        for (String[] linha : dados) escreverLinha(linha);
        fechar();
        rodape();
        System.out.println("[LOG] Fim do relatório");
    }

    // Passo comum: implementado uma única vez
    private List<String[]> buscarDados() {
        return List.of(new String[]{"Ana", "100"}, new String[]{"Bia", "250"});
    }

    // Passos que as subclasses DEVEM implementar
    protected abstract void abrir();

    protected abstract void escreverLinha(String[] campos);

    protected abstract void fechar();

    // GANCHO (hook): passo opcional, vazio por padrão
    protected void rodape() {
    }
}