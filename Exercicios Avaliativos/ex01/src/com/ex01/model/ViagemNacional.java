package com.ex01.model;

import java.time.LocalDate;

public class ViagemNacional extends ViagemCorporativa implements Remarcavel {
    private String rg;
    private String cpf;
    private static final double TAXA = 50.0;

    public ViagemNacional(String destino, LocalDate dataIda, LocalDate dataVolta, String rg, String cpf) {
        super(destino, dataIda, dataVolta);
        this.cpf = cpf;
        this.rg = rg;
    }

    @Override
    public boolean remarcarViagem(LocalDate novaDataIda, LocalDate novaDataVolta, String novoDestino) {
        LocalDate hoje = LocalDate.now();

        LocalDate hojeComAntecedencia = hoje.minusDays(2);

        if (dataIda.isBefore(hojeComAntecedencia)) {
            System.out.println("Erro: Remarcação permitida apenas com 2 dias de antecedência.");
            return false;
        }

        this.dataIda = novaDataIda;
        this.dataVolta = novaDataVolta;
        this.destino = novoDestino;

        System.out.println("\nViagem Nacional remarcada com sucesso! Taxa de remarcação: R$ " + TAXA);
        return true;
    }


    @Override
    public String detalhesViagem() {
        return "\nViagem Nacional para " + destino + "\nData de Ida: " + dataIda + "\nData de Volta: " + dataVolta + "\nCPF: " + cpf + "\nRG: " + rg;
    }
}
