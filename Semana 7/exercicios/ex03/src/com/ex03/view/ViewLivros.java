package com.ex03.view;

import com.ex03.model.Estudante;
import com.ex03.model.Livro;

public class ViewLivros {
    public static void main(String[] args) {
        Livro l1 = new Livro("Java para Iniciantes", "Herbert Schildt");
        Livro l2 = new Livro("Use a Cabeça Java", "Kathy Sierra");

        Estudante e1 = new Estudante("João");
        Estudante e2 = new Estudante("Maria");

        // Emprestando livros
        e1.emprestarLivro(l1); // João empresta "Java para Iniciantes"
        e2.emprestarLivro(l1); // Maria tenta emprestar, mas o livro não está disponível

        // Devolvendo livros
        e1.devolverLivro(); // João devolve "Java para Iniciantes"
        e2.emprestarLivro(l1); // Agora Maria pode emprestar "Java para Iniciantes"

        // Emprestando outro livro
        e2.emprestarLivro(l2); // Maria tenta emprestar outro livro, mas já possui um empréstimo
    }
}
