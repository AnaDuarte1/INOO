package com.ex01.view;

import java.util.ArrayList;

import com.ex01.model.Adm;
import com.ex01.model.Assistente;
import com.ex01.model.Funcionario;
import com.ex01.model.Gerente;
import com.ex01.model.Programador;
import com.ex01.model.Secretario;
import com.ex01.model.Tecnico;

public class Console {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Adm adm = new Adm("noturno", 01, 1000);
        Assistente a = new Assistente(02,2000);
        Gerente g = new Gerente(4000);
        Programador p = new Programador(10000);
        Secretario s = new Secretario(2500);
        Tecnico t = new Tecnico(03, 3000);


        funcionarios.add(adm);
        funcionarios.add(a);
        funcionarios.add(g);
        funcionarios.add(p);
        funcionarios.add(s);
        funcionarios.add(t);

        for(Funcionario f: funcionarios){
            System.out.println(f.calcularBonus());
        }
    }
}
