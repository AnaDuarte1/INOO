/*Escreva um programa que será armazenado dentro de um controle remoto de uma Tv. O
programa deve conter o método “ligar()”. Esse método pode ser utilizado em três situações: na
primeira, a Tv somente será ligada; na segunda, a Tv será ligada e sintonizada em um canal
informado pelo usuário; já na terceira, a Tv será ligada, o canal sintonizado e também o volume
será ajustado de acordo com a preferência do usuário. */


package com.tv.model;

public class ligar {
    private String canal;
    private int volume;

    public ligar(){
        System.out.println("\nLigada" + "\n");
    }

    public ligar(String canal){
        System.out.println("\nLigada no canal: " + canal + "\n");
    }

    public ligar(String canal, int volume){
        System.out.println("\nLigada no canal: " + canal + "\nVolume: " + volume + "\n");
    }

}
