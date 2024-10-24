package com.areas.model;

public class calcularArea {
    private double base;
    private double altura;
    private double lado;
    private double raio;

    public calcularArea(double lado){
        return lado * lado;
    }

    public calcularArea(double altura, double base){
        return base * altura;
    }

    public calcularArea(double raio){
        return 3.14 * raio * raio;
    }
}
