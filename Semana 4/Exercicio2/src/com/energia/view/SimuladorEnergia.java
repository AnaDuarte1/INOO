package com.energia.view;

import com.energia.model.GeradorSolar;

public class SimuladorEnergia {
    public static void main(String[] args){
        GeradorSolar g1Solar = new GeradorSolar(10,5);
        GeradorSolar g2Solar = new GeradorSolar(40,2);

        double somaEnergia = (g1Solar.getEnergiaGerada() + g2Solar.getEnergiaGerada());
        if(  somaEnergia > 10 ){
            System.out.println("\nPotencia Maxima 1: " + g1Solar.getPotenciaMaxima());
            System.out.println("Energia Gerada 1: " + g1Solar.getEnergiaGerada());
            System.out.println("\nPotencia Maxima 2: " + g2Solar.getPotenciaMaxima());
            System.out.println("Energia Gerada 2: " + g2Solar.getEnergiaGerada());
            System.out.println("\nSuperavit Energético");
        }else{
            System.out.println("\nPotencia Maxima 1: " + g1Solar.getPotenciaMaxima());
            System.out.println("Energia Gerada 1: " + g1Solar.getEnergiaGerada());
            System.out.println("\nPotencia Maxima 2: " + g2Solar.getPotenciaMaxima());
            System.out.println("Energia Gerada 2: " + g2Solar.getEnergiaGerada());
            System.out.println("\nDéficit Energético");
        }
    }
}
