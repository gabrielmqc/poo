package org.example.patterns.comportamentais.mediator.problem;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    final String nome;
    final List<Usuario> contatos = new ArrayList<>();   // acoplamento muitos-para-muitos

    Usuario(String nome) {
        this.nome = nome;
    }

    void enviar(String mensagem) {
        for (Usuario u : contatos) u.receber(nome, mensagem);
    }

    void receber(String de, String mensagem) {
        System.out.println("[" + nome + "] recebeu de " + de + ": " + mensagem);
    }
}
