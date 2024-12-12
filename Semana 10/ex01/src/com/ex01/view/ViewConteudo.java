package com.ex01.view;

import java.util.ArrayList;

import com.ex01.model.Conteudo;
import com.ex01.model.Filme;
import com.ex01.model.Serie;

public class ViewConteudo {
    public static void main(String[] args) {
        Filme f1 = new Filme("Ana", 30, "diretor", 10000);
        Filme f2 = new Filme("Beatriz", 200, "Diretor", 20000);
        Serie s1 = new Serie("oiiii", 10, 2, 10);

        ArrayList<Filme> filme = new ArrayList<>();

        filme.add(f1);
        filme.add(f2);
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(s1.toString());


        for(Filme f : filme){
            System.out.println(f.getTitulo() + f.getDuracao() + f.getDiretor() + f.getOrcamento());
        }
        
    }
    
}
