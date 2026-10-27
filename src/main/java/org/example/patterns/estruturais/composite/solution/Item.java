package org.example.patterns.estruturais.composite.solution;

// COMPONENT: interface comum a itens simples e grupos
public interface Item {
    double preco();
    void imprimir(String recuo);
}
