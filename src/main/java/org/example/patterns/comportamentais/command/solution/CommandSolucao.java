package org.example.patterns.comportamentais.command.solution;

public class CommandSolucao {
    public static void main(String[] args) {
        Documento doc = new Documento();
        Historico historico = new Historico();

        historico.executar(new EscreverComando(doc, "Olá, "));
        historico.executar(new EscreverComando(doc, "mundo!"));
        historico.executar(new ApagarComando(doc, 6));
        System.out.println(doc);        // Olá,

        historico.desfazer();
        System.out.println(doc);        // Olá, mundo!
        historico.desfazer();
        System.out.println(doc);        // Olá,
    }
}
