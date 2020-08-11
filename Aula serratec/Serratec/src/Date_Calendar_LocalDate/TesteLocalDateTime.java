package Date_Calendar_LocalDate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

public class TesteLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();

        System.out.println(dataHora);
        System.out.println(dataHora.of(2020, 8, 10, 13, 15, 0));

        ZoneId id = ZoneId.systemDefault();
        System.out.println(id);
        id = ZoneId.of("America/Sao_Paulo");

        Set<String>fusos = ZoneId.getAvailableZoneIds();
        System.out.println("Total de fusos:" + fusos.size());
        for(String f: fusos){
            System.out.println(f);
        }
        
    }
    
}