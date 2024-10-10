package aluno.view;

import aluno.model.Aluno;

public class ViewAluno {
    public static void main(String[] args) {
        Aluno al = new Aluno();

        al.setNome("ana");
        al.setIdade(20);
        al.setMatricula(113232434);

        if(al.getIdade() > 0){
            System.out.println("Nome: " + al.getNome());
            System.out.println("Idade: " + al.getIdade());
            System.out.println("Matricula:" + al.getMatricula());
        }else{
            System.out.println("Idade Inválida!!\n");
        }
       
    }
    
}
