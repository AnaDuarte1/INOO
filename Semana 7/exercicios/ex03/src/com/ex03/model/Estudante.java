package com.ex03.model;

public class Estudante {
    private String nome;
    private Livro livroEmprestado;

    public Estudante(String nome) {
        this.nome = nome;
        this.livroEmprestado = null;
    }

    // Empresta um livro, se disponível e se o estudante ainda não tiver um empréstimo
    public void emprestarLivro(Livro livro) {
        if (livroEmprestado != null) {
            System.out.println(nome + " já possui um livro emprestado: " + livroEmprestado.getTitulo());
        } else if (!livro.isDisponivel()) {
            System.out.println("O livro \"" + livro.getTitulo() + "\" não está disponível para empréstimo.");
        } else {
            livroEmprestado = livro;
            livro.setEmprestado(true);
            System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
        }
    }

    public void devolverLivro() {
        if (livroEmprestado == null) {
            System.out.println(nome + " não possui nenhum livro para devolver.");
        } else {
            System.out.println(nome + " devolveu o livro: " + livroEmprestado.getTitulo());
            livroEmprestado.setEmprestado(false);
            livroEmprestado = null;
        }
    }

    public String getNome() {
        return nome;
    }
}
