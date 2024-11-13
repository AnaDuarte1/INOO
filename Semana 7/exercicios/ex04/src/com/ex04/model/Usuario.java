package com.ex04.model;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String fone;
    private Bicicleta bicicletaReservada;
    private boolean statusReserva;
    private double saldoCreditos;

    public Usuario(String nome, String cpf, String email, String fone, double saldoCreditos) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.fone = fone;
        this.statusReserva = false;
        this.saldoCreditos = saldoCreditos;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getFone() {
        return fone;
    }

    public double getSaldoCreditos() {
        return saldoCreditos;
    }

    public void setSaldoCreditos(double saldoCreditos) {
        this.saldoCreditos = saldoCreditos;
    }

    public boolean isStatusReserva() {
        return statusReserva;
    }

    // Realiza a reserva de uma bicicleta, se disponível e se o saldo for suficiente
    public void reservarBicicleta(Bicicleta bicicleta) {
        if (bicicletaReservada != null) {
            System.out.println(nome + " já possui uma bicicleta reservada.");
        } else if (!bicicleta.isDisponivel()) {
            System.out.println("A bicicleta " + bicicleta.getModelo() + " não está disponível para reserva.");
        } else if (saldoCreditos < 10) {  // Exemplo: 10 créditos mínimos necessários
            System.out.println(nome + " não possui créditos suficientes para realizar a reserva.");
        } else {
            bicicletaReservada = bicicleta;
            bicicleta.setDisponivel(false);
            statusReserva = true;
            System.out.println(nome + " reservou a bicicleta: " + bicicleta.getModelo());
        }
    }

    // Cancela a reserva da bicicleta
    public void cancelarReserva() {
        if (bicicletaReservada == null) {
            System.out.println(nome + " não possui nenhuma reserva para cancelar.");
        } else {
            System.out.println(nome + " cancelou a reserva da bicicleta: " + bicicletaReservada.getModelo());
            bicicletaReservada.setDisponivel(true);
            bicicletaReservada = null;
            statusReserva = false;
        }
    }
}
