package org.example.patterns.comportamentais.visitor.solution;

// CONCRETE VISITORS: cada operação inteira em UMA classe
public class Descritor implements Visitante<String> {
    public String visitar(Livro l)       { return "Livro: " + l.titulo(); }
    public String visitar(Eletronico e)  { return "Eletrônico: " + e.nome(); }
    public String visitar(Alimento a)    { return "Alimento: " + a.nome(); }
}
