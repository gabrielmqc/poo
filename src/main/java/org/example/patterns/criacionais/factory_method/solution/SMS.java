package org.example.patterns.criacionais.factory_method.solution;

class SMS implements Notificacao {
    public void enviar(String destino, String mensagem) {
        System.out.println("[SMS] " + destino + ": " + mensagem);
    }
}
