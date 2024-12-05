package com.ex01.model;

public class Serie extends Conteudo{
    private int temporadas;
    private int episodiosPorTemporada;

    public Serie(String titulo, int duracao, int temporadas, int episodiosPorTemporada){    
        super(titulo, duracao);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodios() {
        return episodiosPorTemporada;
    }

    public void exibirInfo() {
        System.out.println(super.getTitulo() + ", " + super.getDuracao() + ", " + temporadas + ", " + episodiosPorTemporada);
    }
}
