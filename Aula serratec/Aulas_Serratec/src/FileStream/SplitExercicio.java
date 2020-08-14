package FileStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SplitExercicio {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("d:\\AulasJava\\Textos\\arquivo2.txt"));
            String linha = bf.readLine();
            System.out.println(linha);
            String[] palavras = linha.split("\n");
            for(String s: palavras){
                System.out.println(s);
            }
    
            bf.close();
        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo");
        }
    }
}