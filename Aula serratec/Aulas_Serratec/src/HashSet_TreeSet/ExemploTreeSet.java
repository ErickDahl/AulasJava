package HashSet_TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        Set<String> marcas = new TreeSet<String>();

        marcas.add("Honda");
        marcas.add("Renault");
        marcas.add("Fiat");
        marcas.add("BMW");
        marcas.add("Honda");

        if(marcas.isEmpty()){
            System.out.println("Lista vazia");
        } else{
            System.out.println(marcas);
        }

        Iterator<String> valores = marcas.iterator();
        while(valores.hasNext()){
            String marca = valores.next();
            System.out.println(marca);
        }
    }
}