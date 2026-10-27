package org.example.patterns.estruturais.facade.solution;

// Subsistemas (simplificados)
public class Estoque {
    public boolean reservar(String sku, int qtd) { System.out.println("Estoque: reservado " + qtd + "x " + sku); return true; }
    public void liberar(String sku, int qtd)     { System.out.println("Estoque: liberado " + qtd + "x " + sku); }
}
