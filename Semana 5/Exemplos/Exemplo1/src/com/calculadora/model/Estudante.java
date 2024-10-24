package com.calculadora.model;

public class Estudante {
    private String nome;
    private int idade;
    private String matricula;

    public Estudante(){
        this.nome = "Provisorio";
    }

    public Estudante(String nome){
        this.nome = nome;
    }
    
    public Estudante(String nome, int idade, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        
    }


    public String getNome(){
        return this.nome;
    }
}
