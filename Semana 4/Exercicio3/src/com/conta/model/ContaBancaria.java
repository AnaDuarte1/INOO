package com.conta.model;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial; 
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor para saque deve ser positivo!");
            return;
        }
        if (saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para realizar o saque!");
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor para depósito deve ser positivo!");
            return;
        }
        this.saldo += valor; 
    }
}
