/*Escreva um programa que efetue a leitura de duas notas, calcule e mostre a média ponderada
dessas notas. A primeira nota tem peso 1 e a segunda nota tem peso 2.*/

public class Exercicio3{
	public static void main(String[] args) {
		double n1 = 9.5;
		double n2 = 8.2;
		
		double media = ((n1 * 1) + (n2 * 2))/ (1 + 2);
		System.out.println("Media: " + media);
		
	}
}