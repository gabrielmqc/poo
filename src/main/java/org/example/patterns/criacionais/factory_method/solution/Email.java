package org.example.patterns.criacionais.factory_method.solution;

class Email implements Notificacao {
    public void enviar(String destino, String mensagem) {
        System.out.println("[E-MAIL] " + destino + ": " + mensagem);
    }
}
