package org.example.patterns.comportamentais.mediator.solution;

// COLLEAGUE: só conhece o mediador
public class Usuario {
    private final String nome;
    private final Mediador sala;

    Usuario(String nome, Mediador sala) { this.nome = nome; this.sala = sala; }
    String nome() { return nome; }

    void enviar(String mensagem) { sala.enviar(mensagem, this); }

    void receber(String de, String mensagem) {
        System.out.println("[" + nome + "] recebeu de " + de + ": " + mensagem);
    }
}
