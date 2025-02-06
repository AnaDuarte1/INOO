package com.ex01.model;
import java.time.LocalDate;

public class AssinaturaMensal extends Assinatura{

        public AssinaturaMensal(String nomeAssinante, String descricaoProduto, LocalDate dataInicio, double valorMensal) {
            super(nomeAssinante, descricaoProduto, dataInicio, 1, valorMensal);
        }
    
        @Override
        public double calcularTotalPago() {
            LocalDate hoje = LocalDate.now();
            int mesesPagos = ((hoje.getYear() - dataInicio.getYear()) * 12) + (hoje.getMonthValue() - dataInicio.getMonthValue());
            return mesesPagos * valorMensal;
        }
    
        @Override
        public void renovarAssinatura() {
            System.out.println("A assinatura mensal é renovada automaticamente.");
        }
    
        @Override
        public void cancelarAssinatura() {
            System.out.println("Assinatura mensal cancelada sem multa.");
        }
    
        @Override
        public String detalhesAssinatura() {
            return "Assinatura Mensal de " + descricaoProduto + " - Assinante: " + nomeAssinante + "\n" +
                   "Início: " + dataInicio + " | Valor Mensal: R$" + valorMensal + "\n" +
                   "Total Pago até o momento: R$" + calcularTotalPago();
        }

    
}