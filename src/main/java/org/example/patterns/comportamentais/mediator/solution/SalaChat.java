package org.example.patterns.comportamentais.mediator.solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// CONCRETE MEDIATOR: concentra a lógica de interação
public class SalaChat implements Mediador {
    private final List<Usuario> participantes = new ArrayList<>();
    private final Set<Usuario> silenciados = new HashSet<>();

    public void entrar(Usuario usuario) {
        participantes.add(usuario);
    }

    void silenciar(Usuario usuario) {
        silenciados.add(usuario);
    }

    public void enviar(String mensagem, Usuario origem) {
        if (silenciados.contains(origem)) {
            System.out.println("[SALA] Mensagem de " + origem.nome() + " bloqueada");
            return;
        }
        for (Usuario u : participantes) {
            if (u != origem) u.receber(origem.nome(), mensagem);
        }
    }
}
