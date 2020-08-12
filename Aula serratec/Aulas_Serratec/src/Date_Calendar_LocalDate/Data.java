package Date_Calendar_LocalDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) {
        Date data = new Date();

        System.out.println("data de hoje " + data);
        System.out.println("Milisegundos desde 1970 " + data.getTime());
        System.out.println("Dia de hoje " + data.getDate());
        System.out.println("Minutos da hora atual " + data.getMinutes());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(data);
        System.out.println("Data de Hoje: " + dataFormatada);
        
        
    }
}