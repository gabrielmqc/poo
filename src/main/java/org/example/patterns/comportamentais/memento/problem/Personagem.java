package org.example.patterns.comportamentais.memento.problem;

import java.util.ArrayList;
import java.util.List;

// Campos PÚBLICOS: qualquer classe pode alterar o estado interno
public class Personagem {
    public int vida = 100;
    public int fase = 1;
    public List<String> inventario = new ArrayList<>();
}
