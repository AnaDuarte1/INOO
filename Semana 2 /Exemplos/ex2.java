
class ex2 {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.nome = "Edilson";
        f.salarioBruto = 1000;
        System.out.println(f.calcularSalarioLiquido());
    }
}

class Funcionario {
    String nome;
    double salarioBruto;
    public double calcularSalarioLiquido() {
        return salarioBruto * 0.9;
    }
}
