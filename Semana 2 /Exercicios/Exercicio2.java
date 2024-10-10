/*
Crie uma classe que permita a simulação de uma conta bancária. Ela deve conter o nome do
cliente, o tipo da conta (1-Especial; 2-Comum) e o saldo. As seguintes funcionalidades devem ser
fornecidas: a) saque; b) depósito; c) bônus; d) cálculo da tarifa. O bônus e a tarifa devem ser
calculados de acordo com as tabelas abaixo:

Detalhe: o bônus pode ser utilizado somente uma vez.
Saldo Bônus Tipo Conta Tarifa
Até 1000 5%                              1 R$ 25
Acima de 1000  10%                       2 R$ 90 
*/

import java.util.Scanner;

class Conta{

    Scanner ler = new Scanner(System.in);

    String nome;
    int tipoC;
    double saldo;

    public double saque(){
        System.out.println("Digite o valor a ser retirado:");
        double valorS = ler.nextInt();

        double saque = saldo - valorS;

        System.out.println("Saldo Atual: R$" + saque);
    }

    public double deposito(){
        System.out.println("Digite o valor a ser depositado:");
        double valorD = ler.nextInt();

        double deposito = saldo - valorD;

        System.out.println("Saldo Atual: R$" + deposito);
    }

    public double bonus(){
        if(saldo <= 1000){
            saldo = (saldo * 0.05) + saldo;

            System.out.println("Saldo com bônus de 5%: R$" + saldo);

        }else{
            saldo = (saldo * 0.1) + saldo;

            System.out.println("Saldo com bônus de 10%: R$" + saldo);

        }
    }

    public double tarifa(){
        if(tipoC == 1){
            System.out.println("Conta tipo 1 com tarifa e R$25,00!");
        }else{
            System.out.println("Conta tipo 2 com tarifa e R$90,00!");
        }
    }
}
public class Exercicio2 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        Conta c = new Conta();

        System.out.println("Digite o seu nome:");
        c.nome = ler.nextLine();
        System.out.println("Digite o tipo de conta: [1]Especial [2]Comum");
        c.tipoC = ler.nextInt();
        System.out.println("Digite o seu saldo");
        c.saldo = ler.nextDouble();


        do{
            System.out.println("1.Saque");
            System.out.println("2.Deposito");
            System.out.println("3.Bônus:");
            System.out.println("4.Tarifa:");
            System.out.println("5.Sair");

            if(opcao == 1){
                saque();
            }else if(opcao == 2){
                deposito();
            }else if(opcao == 3){
                bonus();
            }else if(opcao == 4){
                System.out.println("\nSaindo...\n");
            }else{
                System.out.println(("\nOpção Inválida!\n"));
            }
        }while( opcao != 4)


    }
}
