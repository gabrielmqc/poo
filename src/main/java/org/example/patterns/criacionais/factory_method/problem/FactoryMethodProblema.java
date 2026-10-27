package org.example.patterns.criacionais.factory_method.problem;

public class FactoryMethodProblema {
    public static void main(String[] args) {
        ServicoPedidos pedidos = new ServicoPedidos();
        pedidos.avisarCliente("email", "cliente@mail.com", "Pedido enviado!");
        pedidos.avisarCliente("sms", "+55 45 99999-0000", "Pedido enviado!");
    }
}
