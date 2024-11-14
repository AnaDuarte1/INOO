package com.ex01.view;

import com.ex01.model.Cliente;
import com.ex01.util.Validador;

public class ViewCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 30);
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Maior de idade: " + Validador.isMaiorDeIdade(cliente.getIdade()));
    }
}

