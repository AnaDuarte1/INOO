package com.cliente.view;

import com.cliente.model.cadastrarCliente;

public class TesteCliente {
    public static void main(String[] args) {

        cadastrarCliente c = new cadastrarCliente("Ana", 19,"anaberocha@hotmail.com");

        System.out.println("\nNome:" + c.getNome() + "\nIdade:" + c.getIdade() + "\nEmail:" + c.getEmail());
    }
}
