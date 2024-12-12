package com.ex01.view;

import java.util.ArrayList;

import com.ex01.model.Livro;

public class ViewLivro {
   public static void main(String[] args) {
        Livro l1 = new Livro("O investigador de bom senso", "John Bogle", 2020);
        Livro l2 = new Livro("Harry Potter", "Ana", 2000);
        Livro l3 = new Livro("1964", "Beatriz", 2010);

        //System.out.println(l1.toString());


        ArrayList<Livro> livro = new ArrayList<>();

        livro.add(l1);
        livro.add(l2);
        livro.add(l3);

        for(Livro l : livro){
            System.out.println("Livro: " + l.getTitulo() + " por " + l.getAutor() + " (" + l.getAnoPublicao() + ")");
        }
   } 
}
