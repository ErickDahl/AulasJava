package HashSet_TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exemplo {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();   

        lista.add("Pain");
        lista.add("Kabum");
        lista.add("Keyd");
        lista.add("SKT");
        lista.add("INTZ");
        System.out.println(lista);

        Set<String> lista2 = new HashSet<String>();
        lista2.addAll(lista);
        lista2.add("Pain");
        lista2.add("Pain");
        System.out.println(lista2);

        Set<Integer> lista3 = new HashSet<Integer>();
        lista3.add(3);
        System.out.println(lista3);

        Iterator<String> valores = lista.iterator();
        while(valores.hasNext()){
            String time = valores.next();
            System.out.println(time);
        }
    }
}