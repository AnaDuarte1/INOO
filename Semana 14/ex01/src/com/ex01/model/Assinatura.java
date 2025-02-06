package com.ex01.model;
import java.time.LocalDate;

abstract class Assinatura implements Renovavel {
    protected String nomeAssinante;
    protected String descricaoProduto;
    protected LocalDate dataInicio;
    protected int frequenciaCobranca; 
    protected double valorMensal;

    public Assinatura(String nomeAssinante, String descricaoProduto, LocalDate dataInicio, int frequenciaCobranca, double valorMensal) {
        this.nomeAssinante = nomeAssinante;
        this.descricaoProduto = descricaoProduto;
        this.dataInicio = dataInicio;
        this.frequenciaCobranca = frequenciaCobranca;
        this.valorMensal = valorMensal;
    }

    public abstract double calcularTotalPago();
    public abstract String detalhesAssinatura();
}

