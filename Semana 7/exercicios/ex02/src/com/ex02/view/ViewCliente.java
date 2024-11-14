package com.ex02.view;

import com.ex02.model.Endereco;
import com.ex02.model.Cliente;
import com.ex02.util.Validador;


public class ViewCliente{
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Av.Dante Verdoline", 182, "Apto 45", 12345, "São Paulo", "SP");
        Cliente cliente = new Cliente("João", 30, endereco);

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Endereço: " + cliente.getEndereco().exibirEndereco());
        System.out.println("Maior de idade: " + Validador.isMaiorDeIdade(cliente.getIdade()));
    }
}