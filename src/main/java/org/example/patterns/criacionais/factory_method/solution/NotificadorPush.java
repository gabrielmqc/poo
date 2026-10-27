package org.example.patterns.criacionais.factory_method.solution;

class NotificadorPush extends Notificador {
    @Override
    protected Notificacao criarNotificacao() { return new Push(); }
}
