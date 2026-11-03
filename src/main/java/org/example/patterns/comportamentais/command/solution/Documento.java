package org.example.patterns.comportamentais.command.solution;

// RECEIVER: quem realmente faz o trabalho
public class Documento {
    final StringBuilder texto = new StringBuilder();

    @Override
    public String toString() {
        return texto.toString();
    }
}
