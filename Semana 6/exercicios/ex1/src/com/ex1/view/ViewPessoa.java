package com.ex1.view;

import com.ex1.model.Pessoa;
import com.ex1.model.Carro;

public class ViewPessoa {
    public static void main(String[] args) {

        Carro c = new Carro(3);
        
        Pessoa p = new Pessoa("Ana", c);

        p.exibirDados();
    }
}
