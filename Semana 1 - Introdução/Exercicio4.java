/*Crie um programa que calcule o fatorial de um número fornecido pelo usuário.*/

import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num;
        int fat = 1;
        int i;
        
        System.out.println("Digite um número:");
        num = ler.nextInt();
        
        for(i = 0; i < num; i++){
            fat = fat * (num - i);
        }
        
        System.out.println("Fatorial de: " + num + " é " + fat);
        
    }
}