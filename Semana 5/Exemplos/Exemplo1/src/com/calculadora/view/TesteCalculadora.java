package com.calculadora.view;

//import com.calculadora.model.Calculadora;
import com.calculadora.model.Estudante;

public class TesteCalculadora {
    public static void main(String[] args) {
        /*Calculadora c = new Calculadora();
        System.out.println(c.somar(4,4));
        System.out.println(c.somar(1.4,4.2));*/
       
        

        Estudante e = new Estudante("Ana",20,"AQ30029808");

        System.out.println(e.getNome());

    }
}
