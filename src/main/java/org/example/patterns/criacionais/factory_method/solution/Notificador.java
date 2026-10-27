package org.example.patterns.criacionais.factory_method.solution;

public abstract class Notificador {
    protected abstract Notificacao criarNotificacao();

    public void avisar(String destino, String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(destino, mensagem);
    }
}
