package com.ex02.model;

public class Pessoas {
    private String nome;
    private int cpf;

    public Pessoas(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }
}
