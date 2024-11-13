package com.ex05.view;

import com.ex05.model.Cliente;
import com.ex05.model.Ingresso;

public class ViewCompra {
    public static void main(String[] args) {
        // Criando ingressos para shows
        Ingresso ingresso1 = new Ingresso(1, "Show do Rock Band", "15/11/2024", 100.0);
        Ingresso ingresso2 = new Ingresso(2, "Festival de Música", "18/11/2024", 150.0);

        // Criando clientes
        Cliente cliente1 = new Cliente("João", "123.456.789-00", "joao@email.com", 120.0);
        Cliente cliente2 = new Cliente("Ana", "987.654.321-00", "ana@email.com", 200.0);

        // Tentativas de compra de ingressos
        cliente1.comprarIngresso(ingresso1);  // João compra o ingresso do Rock Band
        cliente2.comprarIngresso(ingresso1);  // Ana tenta comprar, mas o ingresso já foi vendido

        // Teste de compra com saldo suficiente
        cliente2.comprarIngresso(ingresso2);  // Ana compra o ingresso do Festival de Música
    }
}
