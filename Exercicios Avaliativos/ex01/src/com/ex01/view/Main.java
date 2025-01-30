package com.ex01.view;

import com.ex01.model.ViagemCorporativa;
import com.ex01.model.ViagemInternacional;
import com.ex01.model.ViagemNacional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ViagemInternacional vI = new ViagemInternacional("França",LocalDate.parse("04/02/2025", formato),LocalDate.parse("14/02/2025", formato),"123445");

        ViagemNacional vN = new ViagemNacional("Salvador",LocalDate.parse("04/02/2025", formato),LocalDate.parse("14/02/2025", formato),"12356","1232434");

        System.out.println(vI.detalhesViagem());
        System.out.println(vN.detalhesViagem());

   
        System.out.println("\nTentando remarcar Viagem Internacional...");
        vI.remarcarViagem(LocalDate.parse("31/02/2025", formato),LocalDate.parse("11/02/2025", formato),"França");

        System.out.println("\nTentando remarcar Viagem Nacional...");
        vN.remarcarViagem(LocalDate.parse("31/02/2025", formato),LocalDate.parse("11/02/2025", formato),"Bahia");
    }
}
