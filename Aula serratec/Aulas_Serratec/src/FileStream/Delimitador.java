package FileStream;

import java.util.Scanner;

public class Delimitador {
    public static void main(String[] args) {
        Scanner sc = new Scanner("Gol,Fusca,Fiesta,Sandero,Onix,Siena");
        sc.useDelimiter(",");
        
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();
    }
}