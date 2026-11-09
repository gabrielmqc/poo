package org.example.patterns.comportamentais.memento.problem;

public class MementoProblema {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        Jogo jogo = new Jogo();

        heroi.vida = 40;
        heroi.fase = 3;
        heroi.inventario.add("Espada");
        jogo.salvar(heroi);

        heroi.vida = 0;                  // morreu
        heroi.fase = 4;
        heroi.inventario.clear();

        jogo.carregar(heroi);
        System.out.println("vida=" + heroi.vida + ", fase=" + heroi.fase + ", itens=" + heroi.inventario);
    }
}
