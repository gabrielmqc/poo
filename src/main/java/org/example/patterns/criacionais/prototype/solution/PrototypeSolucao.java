package org.example.patterns.criacionais.prototype.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrototypeSolucao {
    public static void main(String[] args) {
        // Cria o protótipo UMA vez (único acesso ao disco)
        Inimigo orcBase = new Inimigo("orc", Inimigo.carregarSpriteDoDisco("orc.png"),
                100, 1.5, new ArrayList<>(List.of("ataque", "defesa")));

        // Registro de protótipos (variação comum do padrão)
        Map<String, Inimigo> catalogo = new HashMap<>();
        catalogo.put("orc", orcBase);

        List<Inimigo> horda = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            horda.add(catalogo.get("orc").clonar());     // sem tocar o disco
        }

        horda.get(0).x = 40;                              // cada clone é independente
        horda.get(0).getHabilidades().add("furia");       // não afeta os outros

        System.out.println("Leituras de disco: " + Inimigo.leiturasDeDisco);              // 1
        System.out.println("Clone 0: " + horda.get(0).getHabilidades());                  // [ataque, defesa, furia]
        System.out.println("Clone 1: " + horda.get(1).getHabilidades());                  // [ataque, defesa]
    }
}
