package org.example.patterns.comportamentais.strategy.solution;

// CONCRETE STRATEGIES
public class FreteSedex implements CalculoFrete {
    public double calcular(double pesoKg) {
        return 25.0 + pesoKg * 5.0;
    }
}
