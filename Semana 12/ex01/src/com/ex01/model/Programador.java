package com.ex01.model;

public class Programador extends Funcionario{
    public Programador(double salario) {
        super(salario);
    }
    @Override
    public double calcularBonus() {
        return super.getSalario() * 0.20;
    }
}
