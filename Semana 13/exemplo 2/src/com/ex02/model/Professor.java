package com.ex02.model;

public class Professor extends Pessoa{
    public Professor(String nome, int matricula) {
        super(nome, matricula);
    }
    
    @Override
    public void reunioes(){
        System.out.println("\n" + super.getNome() + " da matricula " + super.getMatricula() + " participou da reunião dos professores!\n");
    }
}
