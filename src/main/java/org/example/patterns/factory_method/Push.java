package org.example.patterns.factory_method;

class Push implements Notificacao {
    public void enviar(String destino, String mensagem) {
        System.out.println("[PUSH] " + destino + ": " + mensagem);
    }
}
