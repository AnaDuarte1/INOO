package com.ex01.model;

public class Filme extends Conteudo{
    private String diretor;
    private int orcamento;

    public Filme(String titulo, int duracao, String diretor, int orcamento){    
        super(titulo, duracao);
        this.diretor = diretor;
        this.orcamento = orcamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getOrcamento() {
        return orcamento;
    }

    public void exibirInfo() {
        System.out.println( super.getTitulo() + ", " + super.getDuracao() + ", " + diretor + ", " + orcamento);
    }
}
