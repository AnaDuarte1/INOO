import java.util.Scanner;

class Usina{
    int qtdA;
    int qtdProcessada;
    double custoP;
    double preco;

    public double Lucro(){
        double lucro;
        return lucro = ((preco * qtdProcessada) - (custoP * qtdProcessada));
    }

    public double Capacidade(){
        double capacidadeP;
        return capacidadeP = (qtdProcessada / qtdA);
    }
}

public class Exercicio1 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        Usina u = new Usina();

        System.out.println("Digite a quantidade de cana de açucar estimada:");
        u.qtdA = ler.nextInt();
        System.out.println("Digite a quantidade de cana de açucar processada:");
        u.qtdProcessada = ler.nextInt();
        System.out.println("Digite o custo de produção da cana de açucar:");
        u.custoP = ler.nextDouble();    
        System.out.println("Digite o preço de venda da tonelada:");
        u.preco = ler.nextDouble();    

        System.out.println("Quantidade de cana de açucar processada: " + u.qtdProcessada);
        System.out.println("Valor da tonelada de cana de açucar: R$" + u.preco);
        System.out.println("Lucro da Empresa: R$" + u.Lucro());
        System.out.println("Capacidade de produção utilizada: " + u.Capacidade());

    }
}
