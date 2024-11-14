// logradouro, numero, complemento, cep, cidade e estado.
package com.ex02.model;

public class Endereco {
    private String logradouro;
    private int num;
    private String complemento;
    private int cep;
    private String cidade;
    private String estado;


    public Endereco(String logradouro, int num, String complemento, int cep, String cidade, String estado){
        this.logradouro = logradouro;
        this.num = num;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNum() {
            return num;
        }


    public String getComplemento() {
        return complemento;
    }

   
    public int getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }


    public String getEstado() {
        return estado;
    }

    public String exibirEndereco() {
        return logradouro + ", " + num + ", " + complemento + 
               "\nCEP: " + cep + ", " + cidade + " - " + estado;
    }

}
