package com.ex02.model;

public class Professor extends Pessoas{
    private int ano;
    private String departamento;

    public Professor(String nome, int cpf, String departamento, int ano){
        super(nome, cpf);
        this.ano = ano;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getAno() {
        return ano;
    }

    public void exibirInfo() {
        System.out.println( super.getNome() + ", " + super.getCpf() + ", " + departamento + ", " + ano);
    }
}
