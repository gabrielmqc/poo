package org.example.patterns.estruturais.facade.problem;

public class Frete {
    public double calcular(String cep) {
        System.out.println("Frete calculado para " + cep);
        return 15.0;
    }
}
