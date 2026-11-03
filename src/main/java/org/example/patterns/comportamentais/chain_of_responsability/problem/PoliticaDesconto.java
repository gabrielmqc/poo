package org.example.patterns.comportamentais.chain_of_responsability.problem;

public class PoliticaDesconto {
    String aprovar(double percentual) {
        if (percentual <= 5) {
            return "Atendente aprovou " + percentual + "%";
        } else if (percentual <= 15) {
            return "Gerente aprovou " + percentual + "%";
        } else if (percentual <= 30) {
            return "Diretor aprovou " + percentual + "%";
        }
        return "Desconto de " + percentual + "% recusado";
    }
}
