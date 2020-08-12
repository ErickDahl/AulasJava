package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteListas2 {
    public static void main(String[] args) {
        List lista = Arrays.asList("Cachorro","Papagaio","Gato","Rato"); 
        List lista2 = new ArrayList();

        lista2.add(9.5);
        lista2.add(3.5);

        System.out.println(lista2);
        Collections.sort(lista2);
        System.out.println(lista2);
        
        if(lista.isEmpty()){
            System.out.println("A lista é vazia");
        } else{
            System.out.println(lista);
            Collections.sort(lista);
            System.out.println(lista);
        }

    }
}