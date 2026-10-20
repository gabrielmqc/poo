package org.example.patterns.factory_method;

class NotificadorEmail extends Notificador {
    @Override
    protected Notificacao criarNotificacao() { return new Email(); }
}