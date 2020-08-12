package Enum;

import java.time.LocalDate;

public class TesteOficina {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Onix", LocalDate.of(2020, 8, 8), new Proprietario("Erick"), "Hatch"); 
        
        carro1.trocarOleo();
        carro1.revisao();

        System.out.println(carro1);
    }
}