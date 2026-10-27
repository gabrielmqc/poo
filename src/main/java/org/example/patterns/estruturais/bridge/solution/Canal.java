package org.example.patterns.estruturais.bridge.solution;

// IMPLEMENTOR: como a mensagem é entregue
public interface Canal {
    void enviar(String destino, String texto);
}
