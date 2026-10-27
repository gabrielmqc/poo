package org.example.patterns.estruturais.bridge.solution;

public class CanalPush implements Canal {
    public void enviar(String destino, String texto) {
        System.out.println("[PUSH] " + destino + ": " + texto);
    }
}
