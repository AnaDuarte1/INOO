package com.ex05.model;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private double saldoCreditos;

    // Construtor
    public Cliente(String nome, String cpf, String email, double saldoCreditos) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.saldoCreditos = saldoCreditos;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public double getSaldoCreditos() {
        return saldoCreditos;
    }

    public void setSaldoCreditos(double saldoCreditos) {
        this.saldoCreditos = saldoCreditos;
    }

    // Método para comprar um ingresso
    public void comprarIngresso(Ingresso ingresso) {
        if (!ingresso.isDisponivel()) {
            System.out.println("O ingresso para o show " + ingresso.getNomeDoShow() + " não está mais disponível.");
        } else if (saldoCreditos < ingresso.getPreco()) {
            System.out.println(nome + " não possui saldo suficiente para comprar o ingresso.");
        } else {
            saldoCreditos -= ingresso.getPreco();  // Deduz o saldo do cliente
            ingresso.setDisponivel(false);         // Marca o ingresso como indisponível
            System.out.println(nome + " comprou o ingresso para o show: " + ingresso.getNomeDoShow());
        }
    }
}
