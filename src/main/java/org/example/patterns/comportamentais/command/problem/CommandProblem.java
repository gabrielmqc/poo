package org.example.patterns.comportamentais.command.problem;

public class CommandProblem {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.executar("escrever", "Olá, ");
        editor.executar("escrever", "mundo!");
        editor.executar("apagar", "6");
        System.out.println(editor);     // Olá,

        // E o "desfazer"? O que foi apagado se perdeu...
    }
}
