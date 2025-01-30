package com.ex01.model;

import java.time.LocalDate;

public class ViagemInternacional extends ViagemCorporativa implements Remarcavel {
    private String passaporte;
    private static final double TAXA = 100.0;

    public ViagemInternacional(String destino, LocalDate dataIda, LocalDate dataVolta, String passaporte) {
        super(destino, dataIda, dataVolta);
        this.passaporte = passaporte;
    }

    @Override
    public boolean remarcarViagem(LocalDate novaDataIda, LocalDate novaDataVolta, String novoDestino) {
        LocalDate hoje = LocalDate.now();

        LocalDate hojeComAntecedencia = hoje.minusDays(7);

        if (dataIda.isBefore(hojeComAntecedencia)) {
            System.out.println("Erro: Remarcação permitida apenas com 2 dias de antecedência.");
            return false;
        }

        if (!novoDestino.equals(this.destino)) {
            System.out.println("Erro: Não é permitido trocar o destino em viagens internacionais.");
            return false;
        }

        this.dataIda = novaDataIda;
        this.dataVolta = novaDataVolta;

        System.out.println("\nViagem Internacional remarcada com sucesso! Taxa de remarcação: R$ " + TAXA);
        return true;
    }

    @Override
    public String detalhesViagem() {
        return "\nViagem Internacional para " + destino + "\nData de Ida: " + dataIda + "\nData de Volta: " + dataVolta + "\nPassaporte: " + passaporte;
    }
}

