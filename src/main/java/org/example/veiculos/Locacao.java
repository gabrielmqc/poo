package org.example.veiculos;

public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private String dataInicio;
    private String dataFimPrevista;
    private boolean ativa;

    public Locacao(Cliente cliente, Veiculo veiculo, String dataInicio, String dataFimPrevista) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataFimPrevista = dataFimPrevista;
        this.ativa = false;
    }

    public void iniciar() {
        if (veiculo.isDisponivel()) {
            veiculo.alugar();
            ativa = true;
            System.out.println("Locação iniciada com sucesso.");
        } else {
            System.out.println("Não foi possível iniciar a locação. Veículo indisponível.");
        }
    }

    public void encerrar() {
        if (ativa) {
            veiculo.devolver();
            ativa = false;
            System.out.println("Locação encerrada com sucesso.");
        } else {
            System.out.println("Não há locação ativa.");
        }
    }

    public void exibirResumo() {
        System.out.println("=== RESUMO DA LOCAÇÃO ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Veículo: " + veiculo.getModelo() + " - " + veiculo.getPlaca());
        System.out.println("Início: " + dataInicio);
        System.out.println("Fim prevista: " + dataFimPrevista);
        System.out.println("Ativa: " + (ativa ? "Sim" : "Não"));
    }
}
