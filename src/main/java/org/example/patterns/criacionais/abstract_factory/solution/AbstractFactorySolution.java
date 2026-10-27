package org.example.patterns.criacionais.abstract_factory.solution;

import org.example.patterns.criacionais.abstract_factory.solution.produtos.IBotao;
import org.example.patterns.criacionais.abstract_factory.solution.produtos.ICheckbox;

public class AbstractFactorySolution {

    // Cliente: não conhece nenhuma classe concreta
    static void montarTelaConfig(FabricaGUI fabrica) {
        IBotao botao = fabrica.criarBotao("Salvar");
        ICheckbox check = fabrica.criarCheckbox("Modo escuro");
        botao.desenhar();
        check.desenhar();
    }

    public static void main(String[] args) {
        String sistema = System.getProperty("os.name").toLowerCase();

        // O "if" do SO aparece UMA vez, na inicialização
        FabricaGUI fabrica = sistema.contains("mac")
                ? new FabricaMac()
                : new FabricaWindows();

        montarTelaConfig(fabrica);   // impossível misturar estilos
    }
}
