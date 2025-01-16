package com.ex01.view;


import com.ex01.model.Gerente;


public class Main {
    public static void main(String[] args) {
        //Funcionario f = new Funcionario("Antonio", 4000);
        //a classe é abstrata. Não pode ser instanciada!

        Gerente g1 = new Gerente("José", 8000);

        System.out.println("Nome: " + g1.getNome() + ", Novo salário: " +
        g1.calcularAumentoSalario());
    }
}
