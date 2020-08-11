package HashMap;

import java.util.Map.Entry;
import java.util.HashMap;

public class Municipios {
    public static void main(String[] args) {
        HashMap<String, String> mapaEstados = new HashMap<String, String>();

        mapaEstados.put("AC", "Acre");
        mapaEstados.put("AL", "Alagoas");
        mapaEstados.put("AP", "Amapá");
        mapaEstados.put("AM", "Amazonas");
        mapaEstados.put("MG", "Minas Gerais");
        mapaEstados.put("RJ", "Rio de Janeiro");
        mapaEstados.put("SP", "São Paulo");
        mapaEstados.put("BA", "Bahia");

        System.out.println(mapaEstados);

        System.out.println(mapaEstados.entrySet());

        for(String s : mapaEstados.keySet()){
            System.out.println(s);
        }

        for(Entry<String, String> s : mapaEstados.entrySet()){
            System.out.println(s);
        }
    }
}