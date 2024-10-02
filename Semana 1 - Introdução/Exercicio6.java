/*Implemente um programa que realize a busca binária em um array ordenado*/
import java.util.Scanner;

public class Exercicio6{
    public static void main(String[] args){
         Scanner ler = new Scanner(System.in);
        
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        
        System.out.println("Digite o valor a ser buscado:");
        int valor = ler.nextInt();
        
        int inicio = 0;
        int fim = arr.length - 1;
        
        boolean encontrado = false;
        
        // Loop de busca binária
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            
            if (arr[meio] == valor) {
                System.out.println("Valor encontrado no índice: " + meio);
                encontrado = true;
                break;
            }
            
            if (arr[meio] < valor) {
                inicio = meio + 1; // Procurar na metade direita
            } else {
                fim = meio - 1; // Procurar na metade esquerda
            }
        }
        
        if (!encontrado) {
            System.out.println("Valor não encontrado no array.");
        }
    }
        
}