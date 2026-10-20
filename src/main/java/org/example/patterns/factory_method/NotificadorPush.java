package org.example.patterns.factory_method;

class NotificadorPush extends Notificador {
    @Override
    protected Notificacao criarNotificacao() { return new Push(); }
}
