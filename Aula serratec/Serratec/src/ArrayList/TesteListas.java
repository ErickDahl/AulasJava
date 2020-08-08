package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TesteListas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();

        lista.add("Laranja");
        lista.add("Goiabada");
        lista.add("Abacaxi");
        lista.add("Morango");
        lista.add("Uva");
        lista.add(0,"Maça");

        System.out.println(lista);
        
        System.out.println(lista.size());

        boolean existe = lista.contains("Uva");
        System.out.println(existe);

        lista.remove(1);
        System.out.println(lista);

        System.out.println(lista.get(2));

        System.out.println("--------------------------");

        for(String s : lista){
            System.out.println(s);
        }

        System.out.println("--------------------------");

        for(int i = 0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}