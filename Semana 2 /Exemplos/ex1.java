//Classe representa um conjunto de objetos

class Pessoa {
    String nome;
    int idade;
    void conversar() {
        System.out.println("Blá Blá Blá");
    }
    void comprar() {
        System.out.println("Hora de Gastar $$$$");
    }
    int informarIdade() {
        return idade;
    }
}

public class ex1 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "José";
        p.idade = 25;
        p.conversar();
        p.comprar();
        System.out.println("Idade da Pessoa:" + p.informarIdade());
    }
}