package org.example.patterns.estruturais.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Caixa {
    final List<Produto> produtos = new ArrayList<>();   // listas separadas por tipo
    final List<Caixa> caixas = new ArrayList<>();
}
