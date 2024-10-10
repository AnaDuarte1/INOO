package filmes.view;

import filmes.model.Filmes;

public class ViewFilmes {
    public static void main(String[] args) {

    Filmes fl = new Filmes();

    fl.setTitulo("Harry Potter");
    fl.setAno(2005);
    fl.setValor(39.5);
    

    System.out.println("Titulo: " + fl.getTitulo());
    System.out.println("Ano: " + fl.getAno());
    System.out.println("Valor: R$" + fl.getValor());

    }
   
}
