package org.example.patterns.criacionais.factory_method.solution;

class NotificadorSMS extends Notificador {
    @Override
    protected Notificacao criarNotificacao() { return new SMS(); }
}
