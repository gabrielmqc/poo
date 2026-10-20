package org.example.patterns.factory_method.solution;

class SMS implements Notificacao {
    public void enviar(String destino, String mensagem) {
        System.out.println("[SMS] " + destino + ": " + mensagem);
    }
}
