package org.example.patterns.comportamentais.command.solution;

// CONCRETE COMMANDS: cada ação é um objeto com tudo o que precisa
public class ApagarComando implements Comando {
    private final Documento doc;
    private final int quantidade;
    private String apagado = "";            // guarda o que foi removido

    ApagarComando(Documento doc, int quantidade) {
        this.doc = doc;
        this.quantidade = quantidade;
    }

    public void executar() {
        int inicio = Math.max(0, doc.texto.length() - quantidade);
        apagado = doc.texto.substring(inicio);
        doc.texto.delete(inicio, doc.texto.length());
    }

    public void desfazer() {
        doc.texto.append(apagado);
    }
}