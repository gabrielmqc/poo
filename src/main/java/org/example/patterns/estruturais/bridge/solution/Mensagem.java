package org.example.patterns.estruturais.bridge.solution;

// ABSTRACTION: o que a mensagem é, com uma PONTE para o canal
public abstract class Mensagem {
    protected final Canal canal;

    protected Mensagem(Canal canal) {
        this.canal = canal;
    }

    abstract void enviar(String destino);
}
