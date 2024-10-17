package com.Livros.view;

import com.Livros.model.Livro;

public class Livraria {
    public static void main(String[] args) {

         double valor;
         Livro l1 = new Livro("1984","George Orwell",30);
         Livro l2 = new Livro("Dom Casmurro", "Machado de Assis", 40);
         Livro l3 = new Livro("Sapiens: Uma breve história da humanidade", "Yuvai Noah", 60);

        /*("1984");
        l1.setAutor("George Orwell");
        l1.setPreco(30);

        l2.setTitulo("Dom Casmurro");
        l2.setAutor("Machado de Assis");
        l2.setPreco(40);

        l3.setTitulo("Sapiens: Uma breve história da humanidade");
        l3.setAutor("Yuvai Noah");
        l3.setPreco(60);*/


        valor = (l1.getPreco() + l2.getPreco() + l3.getPreco());

        System.out.println("\nLivro 1:" + l1.getTitulo() + "\nAutor:" + l1.getAutor() + "\nPreco: R$" + l1.getPreco());
        System.out.println("\nLivro 2:" + l2.getTitulo() + "\nAutor:" + l2.getAutor() + "\nPreco: R$" + l2.getPreco());
        System.out.println("\nLivro 3:" + l3.getTitulo() + "\nAutor:" + l3.getAutor() + "\nPreco: R$" + l3.getPreco());
        System.out.println("\nValor total: R$" + valor);

    }
}
