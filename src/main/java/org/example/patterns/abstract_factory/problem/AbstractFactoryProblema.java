package org.example.patterns.abstract_factory.problem;

import org.example.patterns.abstract_factory.problem.buttons.BotaoMac;
import org.example.patterns.abstract_factory.problem.buttons.BotaoWindows;
import org.example.patterns.abstract_factory.problem.checkboxes.CheckboxMac;
import org.example.patterns.abstract_factory.problem.checkboxes.CheckboxWindows;
import org.example.patterns.abstract_factory.problem.produtos.Componente;

import java.util.List;

public class AbstractFactoryProblema {

    static List<Componente> montarTelaLogin(String so) {
        Componente botao;
        Componente check;
        if (so.equals("windows")) {
            botao = new BotaoWindows("Entrar");
            check = new CheckboxWindows("Lembrar de mim");
        } else if (so.equals("mac")) {
            botao = new BotaoMac("Entrar");
            check = new CheckboxMac("Lembrar de mim");
        } else {
            throw new IllegalArgumentException("SO não suportado");
        }
        return List.of(botao, check);
    }

    static List<Componente> montarTelaConfig(String so) {
        Componente botao;
        Componente check;
        if (so.equals("windows")) {
            botao = new BotaoWindows("Salvar");
            check = new CheckboxMac("Modo escuro");   // BUG: mistura de estilos
        } else if (so.equals("mac")) {
            botao = new BotaoMac("Salvar");
            check = new CheckboxMac("Modo escuro");
        } else {
            throw new IllegalArgumentException("SO não suportado");
        }
        return List.of(botao, check);
    }

    public static void main(String[] args) {
        montarTelaLogin("windows").forEach(Componente::desenhar);
        montarTelaConfig("windows").forEach(Componente::desenhar); // sai misturado!
    }
}
