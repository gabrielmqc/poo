package org.example.patterns.comportamentais.strategy.solution;

// CONCRETE STRATEGIES
public class FretePAC implements CalculoFrete{
    public double calcular(double pesoKg) {
        return 10.0 + pesoKg * 3.0;
    }
}
