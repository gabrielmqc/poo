package org.example.patterns.estruturais.adapter.problem;

public class GatewayLegado {
    public int efetuarCobranca(int valorEmCentavos, String numeroCartao) {
        System.out.println("[Legado] Cobrando " + valorEmCentavos + " centavos");
        return 0;   // 0 = sucesso
    }
}
