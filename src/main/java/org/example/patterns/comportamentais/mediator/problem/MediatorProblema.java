package org.example.patterns.comportamentais.mediator.problem;

import java.util.List;

public class MediatorProblema {
    public static void main(String[] args) {
        Usuario ana = new Usuario("Ana");
        Usuario bia = new Usuario("Bia");
        Usuario caio = new Usuario("Caio");

        // Cada usuário precisa conhecer todos os outros
        ana.contatos.addAll(List.of(bia, caio));
        bia.contatos.addAll(List.of(ana, caio));
        caio.contatos.addAll(List.of(ana, bia));

        ana.enviar("Bom dia, pessoal!");

        // Entrou o Dani: é preciso atualizar a lista de TODOS os outros
        // e dar a ele a lista de todos
    }
}
