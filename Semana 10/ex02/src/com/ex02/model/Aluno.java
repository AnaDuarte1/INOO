package com.ex02.model;

public class Aluno extends Pessoas{
    private int prontuario;
    private String curso;

    public Aluno(String nome, int cpf, String curso, int prontuario){
        super(nome, cpf);
        this.curso = curso;
        this.prontuario = prontuario;
    }

    public String getCurso() {
        return curso;
    }

    public int getProntuario() {
        return prontuario;
    }
    
    public void exibirInfo() {
        System.out.println( super.getNome() + ", " + super.getCpf() + ", " + curso + ", " + prontuario);
    }
}
