package com.ex01.model;

public class Funcionario {
    private double salario;
    
    public Funcionario (double salario) {
        this.salario = salario;
    }
    public double calcularBonus() {
        return salario * 0.10;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}