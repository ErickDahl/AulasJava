package FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraScanner {
    public static void main(String[] args) {
        File arquivo = new File("d:\\AulasJava\\teste.txt");
        try{
            Scanner sc = new Scanner(arquivo);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            sc.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
}