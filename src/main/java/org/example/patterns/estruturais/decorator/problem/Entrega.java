package org.example.patterns.estruturais.decorator.problem;

public class Entrega {
    private final boolean presente;
    private final boolean seguro;
    private final boolean expressa;
    // Cada adicional novo = outro parâmetro aqui, em TODAS as chamadas

    public Entrega(boolean presente, boolean seguro, boolean expressa) {
        this.presente = presente;
        this.seguro = seguro;
        this.expressa = expressa;
    }

    public double custo() {
        double custo = 10.0;
        if (presente) custo += 5.0;
        if (seguro)   custo += 8.0;
        if (expressa) custo += 20.0;
        return custo;
    }

    public String descricao() {
        String d = "Entrega padrão";
        if (presente) d += " + presente";
        if (seguro)   d += " + seguro";
        if (expressa) d += " + expressa";
        return d;
    }
}
// Alternativa por herança: EntregaPresente, EntregaSeguro, EntregaPresenteSeguro,
// EntregaPresenteExpressa... → 2^N classes para N adicionais