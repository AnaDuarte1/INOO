package com.ex01.view;

public class ViewNome {
   public static void main(String[] args) {
      String nome1 = "ana";
      String nome2 = "beatriz";
      String nome3 = "duarte";

      int tam1 = nome1.length();

      String nomeP = nome1.substring(0, 1);
      String nomeF = nome1.substring(tam1 - 1, tam1);

      String parteA = nomeP + nomeF;
      System.out.println(parteA);

      int inicio = 0;
      int metade = (inicio + nome2.length()) / 2;

      if(metade % 2 != 0){
         metade += 1;
      }

      String parteB = parteA + nome2.substring(0, metade);

      System.out.println(parteB);

      String parteC = nome3.substring(1, 2);
      for(int i = 0; i < nome3.length(); i++){
         if(i % 2 != 0){
            parteC = parteC + nome3.substring(i, i + 1);
         }
      }

      String senha = parteB+parteC.toUpperCase();
      System.out.println(senha);
   }

}
