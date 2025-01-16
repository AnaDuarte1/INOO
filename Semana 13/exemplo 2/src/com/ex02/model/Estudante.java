package com.ex02.model;

public class Estudante extends Pessoa{
    public Estudante(String nome, int matricula) {
        super(nome, matricula);
    }
    
    @Override
    public void reunioes(){
        System.out.println( "\n" + super.getNome() + " da matricula " + super.getMatricula() + " participou da reunião da assembléia de alunos!\n");
    }
}
