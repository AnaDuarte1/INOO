package com.ex02.view;

import com.ex02.model.Aluno;
import com.ex02.model.Pessoas;
import com.ex02.model.Professor;

public class Main {
    public static void main(String[] args) {
       Aluno a1 = new Aluno("Ana", 12345678, "Sistemas para Internet", 3029808);
       Professor p1 = new Professor("Gabi", 338783, "Tecnologia", 2024);
       
        a1.exibirInfo();
        p1.exibirInfo(); 
    
    }
}
