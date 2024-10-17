package com.conta.view;

import com.conta.model.ContaBancaria;

public class ViewConta {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("12345", 300);
    
        System.out.println("Saldo inicial da conta: R$" + cb.getSaldo());

        cb.depositar(400.0);
        System.out.println("Saldo após o deposito: R$" + cb.getSaldo());

        cb.sacar(100.0);
        System.out.println("Saldo após o saque: R$" + cb.getSaldo());
    }

}
