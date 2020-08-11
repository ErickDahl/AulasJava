package Date_Calendar_LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TesteLocalDate {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        System.out.println(LocalDate.of(2020, 8, 10));
        System.out.println(LocalDate.parse("2020-10-08"));

        System.out.println("Hoje é " + hoje);
        System.out.println("Amanhã é: " + hoje.plusDays(1));

        System.out.println("Dias atrás: " + hoje.minusDays(5));
        System.out.println("Dois meses no futuro: " + hoje.plus(2, ChronoUnit.MONTHS));
        System.out.println(hoje.getDayOfWeek());

        System.out.println("Esse ano é bisexto:" + hoje.isLeapYear());



    }   
}