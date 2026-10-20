package org.example.patterns.factory_method;

class NotificadorSMS extends Notificador {
    @Override
    protected Notificacao criarNotificacao() { return new SMS(); }
}
