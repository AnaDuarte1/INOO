package com.Ana.academico.view;

import com.Ana.academico.model.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.nome = "Ana";
        a1.setIdade(19);

        System.out.println("\nNome:" + a1.nome + "\nIdade:" + a1.getIdade());
    }
}
