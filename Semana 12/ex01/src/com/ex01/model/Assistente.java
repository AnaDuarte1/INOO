package com.ex01.model;

public class Assistente extends Funcionario{
    private int codigo;

    public Assistente(int codigo, double salario){ 
        super(salario);
        this.codigo = codigo;
    }

    public double getCodigo() {
        return codigo;
    }
}
