package HashMap;

import java.util.HashMap;

public class Nomes {
    public static void main(String[] args) {
        HashMap<Integer, String> nomes = new HashMap<Integer, String>();

        nomes.put(1, "João");
        nomes.put(2, "Maria");
        nomes.put(3, "Carlos");
        nomes.put(4, "Adriana");

        System.out.println(nomes);

        nomes.replace(2, "José da Silva");
        nomes.remove(4);

        boolean a = nomes.isEmpty();

        System.out.println(nomes + " Mapa vazio? " + a);

        System.out.println(nomes.get(3));
        System.out.println(nomes.keySet());
        //System.out.println(nomes);
    }
}