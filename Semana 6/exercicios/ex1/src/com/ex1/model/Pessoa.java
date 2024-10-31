package com.ex1.model;

public class Pessoa {
    private String nome;
    private Carro carro;

    public Pessoa(String nome, Carro carro){
        this.nome = nome;
        this.carro = carro;
    }

    public void exibirDados(){
        System.out.println(nome + " tem " + carro.getQtdCarro() + " carros");
    }
}
