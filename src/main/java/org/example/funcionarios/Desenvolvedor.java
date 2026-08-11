package org.example.funcionarios;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.1;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, sou " + nome + " e sou desenvolvedor.");

    }
}
