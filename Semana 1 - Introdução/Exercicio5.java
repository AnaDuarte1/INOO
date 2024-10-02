/*. Crie um programa que gerencie um estacionamento rotativo de carros. O programa deve
armazenar a descrição do carro, a placa, o horário de entrada e o horário de saída (despreze os
minutos). O estacionamento cobra X reais pela primeira hora de permanência com o automóvel
e X/3 pelas demais horas. Além disso, é fornecido um desconto para o pagamento de acordo com
a tabela abaixo:
Valor Desconto (%)
Até R$ 20 (inclusive) 5
Entre R$ 20 e R$ 50 (inclusive) 10
Acima de R$ 50 20
O programa deve exibir um relatório contendo as seguintes informações:
a) Tipo do carro.
b) Placa.
c) Hora da Entrada.
d) Hora da Saída.
e) Valor Pago.*/

import java.util.Scanner;

public class Exercicio5{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a descrição do carro:");
        String descricao = ler.nextLine();
        
        System.out.println("Digite a placa do carro:");
        String placa = ler.nextLine();
        
        System.out.println("Digite a hora de entrada:");
        int horaEntrada = ler.nextInt();
        
        System.out.println("Digite a hora de saída:");
        int horaSaida = ler.nextInt();
        
        System.out.println("Digite o valor cobrado por hora:");
        int x = ler.nextInt();
        
        int duracao = horaSaida - horaEntrada;
        double valor = 0;
        
        valor = x + (duracao - 1) * ( x / 3); 

        double desconto = 0;
        
        if (valor <= 20) {
            desconto = 0.05;
        } else if (valor <= 50) {
            desconto = 0.10;
        } else {
            desconto = 0.20;
        }
        
        double valorPago = valor - (valor * desconto);

        System.out.println("Tipo do carro: " + descricao);
        System.out.println("Placa: " + placa);
        System.out.println("Hora da Entrada: " + horaEntrada);
        System.out.println("Hora da Saída: " + horaSaida);
        System.out.printf("Valor Pago: R$ %.2f%n", valorPago);
    }
}