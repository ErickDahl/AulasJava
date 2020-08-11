package Date_Calendar_LocalDate;

import java.util.Calendar;

public class Calendario {
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();
        System.out.println(hoje);

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR);
        int minuto = hoje.get(Calendar.MINUTE);
        int segundo = hoje.get(Calendar.SECOND);

        System.out.println(dia + "-" + mes + "-" + ano);
        System.out.println(hora);

        System.out.printf("Hoje é: %02d/%02d/%d", dia,mes+1 ,ano);
        System.out.printf("\nHora: %d/%d/%02d", hora,minuto,segundo);

    } 
}