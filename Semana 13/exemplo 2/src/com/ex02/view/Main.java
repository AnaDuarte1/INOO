package com.ex02.view;

import com.ex02.model.Estudante;
import com.ex02.model.Professor;

public class Main {
    public static void main(String[] args) {
        Estudante e = new Estudante("Ana Beatriz", 1234);
        Professor p = new Professor("Edilson", 6789);

        e.reunioes();
        p.reunioes();
    }
}
