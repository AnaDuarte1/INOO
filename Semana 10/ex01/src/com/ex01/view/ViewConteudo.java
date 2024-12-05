package com.ex01.view;

import com.ex01.model.Conteudo;
import com.ex01.model.Filme;
import com.ex01.model.Serie;

public class ViewConteudo {
    public static void main(String[] args) {
        Filme f1 = new Filme("Ana", 30, "diretor", 10000);
        Filme f2 = new Filme("Beatriz", 200, "Diretor", 20000);
        Serie s1 = new Serie("oiiii", 10, 2, 10);
        f1.exibirInfo();
        f2.exibirInfo();
        s1.exibirInfo();
        
    }
    
}
