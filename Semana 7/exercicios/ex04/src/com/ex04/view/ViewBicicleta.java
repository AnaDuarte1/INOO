package com.ex04.view;

import com.ex04.model.Usuario;
import com.ex04.model.Bicicleta;

public class ViewBicicleta {
    public static void main(String[] args) {
        // Criando bicicletas
        Bicicleta b1 = new Bicicleta(101, "Mountain Bike", "Estação Central");
        Bicicleta b2 = new Bicicleta(102, "Bicicleta Urbana", "Estação Sul");

        // Criando usuários
        Usuario u1 = new Usuario("Carlos", "123.456.789-00", "carlos@email.com", "11912345678", 15.0);
        Usuario u2 = new Usuario("Ana", "987.654.321-00", "ana@email.com", "11987654321", 5.0);

        // Reservando bicicletas
        u1.reservarBicicleta(b1); // Carlos reserva a Mountain Bike
        u2.reservarBicicleta(b1); // Ana tenta reservar, mas a bicicleta já está ocupada

        // Cancelando e reservando novamente
        u1.cancelarReserva();     // Carlos cancela a reserva
        u2.reservarBicicleta(b1); // Agora Ana pode reservar a Mountain Bike

        // Tentativa de reserva com saldo insuficiente
        u2.reservarBicicleta(b2); // Ana tenta reservar uma segunda bicicleta, mas só pode uma por vez
    }
}
