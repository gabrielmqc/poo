package org.example.patterns.comportamentais.visitor.solution;

// CONCRETE VISITORS: cada operação inteira em UMA classe
public class CalculadoraImposto implements Visitante<Double> {
    public Double visitar(Livro l)       { return 0.0; }
    public Double visitar(Eletronico e)  { return e.preco() * 0.25; }
    public Double visitar(Alimento a)    { return a.preco() * 0.07; }
}