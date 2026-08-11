package org.example.funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apresentavel> apresentaveis = new ArrayList<>();

        apresentaveis.add(new Gerente("João", 5000));
        apresentaveis.add(new Desenvolvedor("Maria", 4000));
        apresentaveis.add(new Estagiario("Jorge", 800));

        for (Apresentavel pessoa : apresentaveis) {
            pessoa.apresentar();
        }
    }
}
