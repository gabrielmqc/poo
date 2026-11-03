package org.example.patterns.comportamentais.command.solution;

//COMMAND
public interface Comando {
    void executar();

    void desfazer();
}
