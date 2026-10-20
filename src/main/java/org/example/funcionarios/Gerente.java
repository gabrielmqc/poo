package org.example.funcionarios;

public class Gerente extends Funcionario implements Apresentavel {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase *1.2;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, sou " + nome + " e sou gerente.");

    }
}
