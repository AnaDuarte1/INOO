/*Crie uma classe Filme. A classe deve conter os atributos titulo, ano, valor e métodos para
recuperar o título do filme, o ano no qual foi lançado e também seu preço. */

package filmes.model;

public class Filmes {
    private String titulo;
    private int ano;
    private double valor;


    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }


    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
}
