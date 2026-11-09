package org.example.patterns.comportamentais.mediator.solution;

//MEDIATOR
public interface Mediador {
    void entrar(Usuario usuario);
    void enviar(String mensagem, Usuario origem);
}
