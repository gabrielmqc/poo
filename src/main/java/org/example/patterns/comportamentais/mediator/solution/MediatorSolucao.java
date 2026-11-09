package org.example.patterns.comportamentais.mediator.solution;

public class MediatorSolucao {
    public static void main(String[] args) {
        SalaChat sala = new SalaChat();

        Usuario ana = new Usuario("Ana", sala);
        Usuario bia = new Usuario("Bia", sala);
        Usuario caio = new Usuario("Caio", sala);
        sala.entrar(ana);
        sala.entrar(bia);
        sala.entrar(caio);

        ana.enviar("Bom dia, pessoal!");

        sala.silenciar(caio);
        caio.enviar("Oi?");              // bloqueada pela sala

        Usuario dani = new Usuario("Dani", sala);
        sala.entrar(dani);               // ninguém precisa ser alterado
        dani.enviar("Cheguei!");
    }
}
