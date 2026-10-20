package org.example.patterns.factory_method.solution;

public class FactoryMethodSolucao {

    static void finalizarPedido(Notificador notificador) {
        notificador.avisar("cliente@mail.com", "Pedido enviado!");
    }

    public static void main(String[] args) {
        finalizarPedido(new NotificadorEmail());
        finalizarPedido(new NotificadorSMS());
        finalizarPedido(new NotificadorPush());
    }
}
