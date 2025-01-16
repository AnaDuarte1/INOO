package com.ex02.model;

public abstract class Pessoa {
    private String nome;
    private int matricula;

    public Pessoa(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract void reunioes();

    public String getNome() {
        return nome;
    }
    
    public int getMatricula() {
        return matricula;
    }
}
