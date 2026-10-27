package org.example.patterns.estruturais.bridge.solution;

public class CanalEmail implements Canal{
    public void enviar(String destino, String texto) {
        System.out.println("[E-MAIL] " + destino + ": " + texto);
    }
}
