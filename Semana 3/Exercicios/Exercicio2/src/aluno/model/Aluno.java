/*Crie uma classe Aluno que contenha os atributos nome, matrícula e idade. Adicione um
construtor para inicializar esses atributos e métodos get e set para acesso dos dados. Organize as
classes em pacotes. Inclua uma regra de validação para que a idade do aluno não possa ser
negativa */

package aluno.model;

public class Aluno {
    private String nome;
    private int matricula;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }


    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
