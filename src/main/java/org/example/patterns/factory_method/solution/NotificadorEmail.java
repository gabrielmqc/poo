package org.example.patterns.factory_method.solution;

class NotificadorEmail extends Notificador {
    @Override
    protected Notificacao criarNotificacao() { return new Email(); }
}