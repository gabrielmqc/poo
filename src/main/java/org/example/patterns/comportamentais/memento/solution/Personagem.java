package org.example.patterns.comportamentais.memento.solution;

import java.util.ArrayList;
import java.util.List;

// ORIGINATOR: tem estado privado e cria/restaura seus próprios snapshots
public class Personagem {
    private int vida = 100;
    private int fase = 1;
    private final List<String> inventario = new ArrayList<>();

    void ferir(int dano)   { vida = Math.max(0, vida - dano); }
    void avancarFase()     { fase++; }
    void pegar(String item) { inventario.add(item); }

    Checkpoint salvar() { return new Checkpoint(vida, fase, inventario); }

    void restaurar(Checkpoint c) {
        this.vida = c.vida;
        this.fase = c.fase;
        this.inventario.clear();
        this.inventario.addAll(c.inventario);
    }

    @Override public String toString() {
        return "vida=" + vida + ", fase=" + fase + ", itens=" + inventario;
    }

    // MEMENTO: guarda o estado; os campos são privados, só o Personagem os lê
    static final class Checkpoint {
        private final int vida;
        private final int fase;
        private final List<String> inventario;

        private Checkpoint(int vida, int fase, List<String> inventario) {
            this.vida = vida;
            this.fase = fase;
            this.inventario = new ArrayList<>(inventario);   // cópia
        }
    }
}
