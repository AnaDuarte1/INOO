package com.ex01.model;
import java.time.LocalDate;

public class AssinaturaAnual extends Assinatura{
      private double desconto; // Percentual de desconto
    private boolean cancelada = false;

    public AssinaturaAnual(String nomeAssinante, String descricaoProduto, LocalDate dataInicio, double valorMensal, double desconto) {
        super(nomeAssinante, descricaoProduto, dataInicio, 12, valorMensal);
        this.desconto = desconto;
    }

    @Override
    public double calcularTotalPago() {
        LocalDate hoje = LocalDate.now();
        int anosPagos = hoje.getYear() - dataInicio.getYear();
        double valorAnual = (valorMensal * 12) * (1 - desconto / 100);
        return anosPagos * valorAnual;
    }

    @Override
    public void renovarAssinatura() {
        System.out.println("A assinatura anual foi renovada automaticamente.");
    }

    @Override
    public void cancelarAssinatura() {
        cancelada = true;
        double multa = (valorMensal * 12) * 0.3;
        System.out.println("Assinatura anual cancelada. Multa de R$" + multa + " aplicada.");
    }

    @Override
    public String detalhesAssinatura() {
        return "Assinatura Anual de " + descricaoProduto + " - Assinante: " + nomeAssinante + "\n" +
               "Início: " + dataInicio + " | Valor Anual (c/ desconto): R$" + ((valorMensal * 12) * (1 - desconto / 100)) + "\n" +
               "Total Pago até o momento: R$" + calcularTotalPago();
    }
}