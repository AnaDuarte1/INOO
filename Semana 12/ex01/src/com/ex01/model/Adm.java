package com.ex01.model;

public class Adm extends Assistente{
    private String turno;

    public Adm(String turno, int codigo, double salario){
        super(codigo, salario);
        this.turno = turno;  
    }

    public String getTurno() {
        return turno;
    }
  
    @Override
    public double calcularBonus() {
        if(turno == "noturno"){
            return super.getSalario() * 0.20;
        }else{
            return super.getSalario();
        }
    }
}
