package org.example.patterns.estruturais.bridge.solution;

public class CanalSMS implements Canal {
    public void enviar(String destino, String texto) {
        System.out.println("[SMS] " + destino + ": " + texto);
    }
}
