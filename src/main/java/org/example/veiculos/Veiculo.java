package org.example.veiculos;

public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private boolean disponivel;

    public Veiculo(String placa, String modelo, String marca, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.disponivel = true;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void alugar() {
        if (disponivel) {
            disponivel = false;
        } else {
            System.out.println("Veículo indisponível.");
        }
    }

    public void devolver() {
        disponivel = true;
    }

    public void exibirDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}
