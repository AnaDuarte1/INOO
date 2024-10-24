/*Elabore um programa para cadastro de clientes com métodos sobrecarregados
“cadastrarCliente()” que permitam a criação de perfis com: i) nome e idade; ii) nome, idade e e-
mail.*/

package com.cliente.model;

public class cadastrarCliente{
 
    private String nome;
    int idade;
    String email;

    public cadastrarCliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

     public cadastrarCliente(String nome, int idade, String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

     public int getIdade(){
        return this.idade;
    }

     public String getEmail(){
        return this.email;
    }

}


