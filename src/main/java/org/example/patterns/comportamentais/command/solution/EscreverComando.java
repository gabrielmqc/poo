package org.example.patterns.comportamentais.command.solution;

// CONCRETE COMMANDS: cada ação é um objeto com tudo o que precisa
public class EscreverComando implements Comando {
    private final Documento doc;
    private final String trecho;

    EscreverComando(Documento doc, String trecho) {
        this.doc = doc;
        this.trecho = trecho;
    }

    public void executar() {
        doc.texto.append(trecho);
    }

    public void desfazer() {
        doc.texto.setLength(doc.texto.length() - trecho.length());
    }
}
