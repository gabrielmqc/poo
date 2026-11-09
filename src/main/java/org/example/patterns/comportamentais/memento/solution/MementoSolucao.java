package org.example.patterns.comportamentais.memento.solution;

public class MementoSolucao {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        Jogo jogo = new Jogo();

        heroi.ferir(60);
        heroi.avancarFase();
        heroi.avancarFase();
        heroi.pegar("Espada");
        jogo.salvar(heroi);                      // checkpoint
        System.out.println("Salvo:     " + heroi);

        heroi.ferir(40);                         // morreu
        heroi.avancarFase();
        heroi.pegar("Poção");
        System.out.println("Depois:    " + heroi);

        jogo.carregarUltimo(heroi);
        System.out.println("Restaurado: " + heroi);
    }
}
