package com.ex01.view;
import com.ex01.model.AssinaturaAnual;
import com.ex01.model.AssinaturaMensal;
import java.time.LocalDate;


public class Main {
     public static void main(String[] args) {
        AssinaturaMensal mensal = new AssinaturaMensal("Ana Beatriz", "Netflix", LocalDate.of(2024, 1, 10), 39.90);
        AssinaturaAnual anual = new AssinaturaAnual("Luidi", "Spotify", LocalDate.of(2023, 2, 1), 19.90, 10);

        System.out.println(mensal.detalhesAssinatura());
        mensal.renovarAssinatura();
        mensal.cancelarAssinatura();

        System.out.println("\n" + anual.detalhesAssinatura());
        anual.renovarAssinatura();
        anual.cancelarAssinatura();
    }

}
