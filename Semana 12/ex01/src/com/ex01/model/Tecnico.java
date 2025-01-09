package com.ex01.model;

public class Tecnico extends Assistente{

    public Tecnico(int codigo, double salario) {
        super(codigo, salario);
    }

    @Override
    public double calcularBonus() {
        return super.getSalario() * 0.30;
    }
}
