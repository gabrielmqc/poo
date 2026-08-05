package org.example.veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("ABC-1234", "Uno", "Fiat", 2020);
        Cliente c1 = new Cliente("João Silva", "123.456.789-00", "987654321");

        Locacao locacao = new Locacao(c1, v1, "05/08/2026", "10/08/2026");

        System.out.println("Dados do veículo antes da locação:");
        v1.exibirDados();

        System.out.println();
        locacao.iniciar();

        System.out.println();
        locacao.exibirResumo();

        System.out.println();
        System.out.println("Dados do veículo após iniciar locação:");
        v1.exibirDados();

        System.out.println();
        locacao.encerrar();

        System.out.println();
        System.out.println("Dados do veículo após encerramento:");
        v1.exibirDados();
    }
}