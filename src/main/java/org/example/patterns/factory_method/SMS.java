package org.example.patterns.factory_method;

class SMS implements Notificacao {
    public void enviar(String destino, String mensagem) {
        System.out.println("[SMS] " + destino + ": " + mensagem);
    }
}
