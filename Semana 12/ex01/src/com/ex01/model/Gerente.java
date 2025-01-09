package com.ex01.model;

public class Gerente extends Funcionario{
    public Gerente(double salario) {
        super(salario);
    }
    @Override
    public double calcularBonus() {
        return super.getSalario() * 0.40;
    }
}
