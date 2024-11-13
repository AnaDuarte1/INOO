package com.ex05.model;

public class Ingresso {
    private int id;
    private String nomeDoShow;
    private String data;
    private double preco;
    private boolean disponivel;

    public Ingresso(int id, String nomeDoShow, String data, double preco) {
        this.id = id;
        this.nomeDoShow = nomeDoShow;
        this.data = data;
        this.preco = preco;
        this.disponivel = true;  // O ingresso começa como disponível
    }

    public int getId() {
        return id;
    }

    public String getNomeDoShow() {
        return nomeDoShow;
    }

    public String getData() {
        return data;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
