package com.ex2.model;

public class Conversor {
    private double conversao;
    public static  final double resultado;

    public static double conversaoKM(double comprimento){
        return resultado = comprimento * 1.609;
    }

    public static double conversaoCelsius(double temp){
        return resultado = ((temp * 1.8) + 32);
    }

    public static double conversaoKM(double volume){
        return resultado = (volume/1000);
    }
}
