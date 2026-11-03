package org.example.patterns.comportamentais.command.problem;

public class Editor {
    private final StringBuilder texto = new StringBuilder();

    void executar(String acao, String argumento) {
        if (acao.equals("escrever")) {
            texto.append(argumento);
        } else if (acao.equals("apagar")) {
            int qtd = Integer.parseInt(argumento);
            texto.setLength(Math.max(0, texto.length() - qtd));   // trecho apagado: perdido
        }
        // amanhã: negrito, maiúsculas, colar...
    }

    @Override
    public String toString() {
        return texto.toString();
    }
}