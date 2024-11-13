package com.ex04.model;

public class Bicicleta {
    private int id;
    private String modelo;
    private String localizacao;
    private boolean disponivel;
    private int kmRodados;
    private String ultimaReserva;
    private boolean statusManutencao;

    public Bicicleta(int id, String modelo, String localizacao) {
        this.id = id;
        this.modelo = modelo;
        this.localizacao = localizacao;
        this.disponivel = true;  // Bicicleta inicialmente disponível
        this.kmRodados = 0;
        this.statusManutencao = false;  // Inicialmente sem necessidade de manutenção
        this.ultimaReserva = "Nenhuma reserva registrada";  // Mensagem padrão
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public boolean isDisponivel() {
        return disponivel && !statusManutencao; // Disponível se não estiver em manutenção
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        this.ultimaReserva = disponivel ? "Disponível" : "Reservada recentemente"; // Mensagem de status simples
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    public boolean isStatusManutencao() {
        return statusManutencao;
    }

    public void setStatusManutencao(boolean statusManutencao) {
        this.statusManutencao = statusManutencao;
    }

    public String getUltimaReserva() {
        return ultimaReserva;
    }
}
