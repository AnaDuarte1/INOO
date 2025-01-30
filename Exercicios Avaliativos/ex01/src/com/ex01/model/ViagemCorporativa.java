package com.ex01.model;

import java.time.LocalDate;

public abstract class ViagemCorporativa {
    protected String destino;
    protected LocalDate dataIda;
    protected LocalDate dataVolta;

    public ViagemCorporativa(String destino, LocalDate dataIda, LocalDate dataVolta) {
        this.destino = destino;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getDataIda() {
        return dataIda;
    }

    public LocalDate getDataVolta() {
        return dataVolta;
    }

    public abstract String detalhesViagem();
}

