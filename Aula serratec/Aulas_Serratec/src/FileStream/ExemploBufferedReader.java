package FileStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import TryCatch.Quantidade;

public class ExemploBufferedReader {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("d:\\AulasJava\\Textos\\teste.txt"));
            int quantidade = 0;
            while(br.ready()){
                //System.out.println(br.readLine());
                String texto = br.readLine();
                quantidade += texto.length();
                System.out.println(texto.length());
            }  
            System.out.println("tamanho da linha " + quantidade);
        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo");
        }
    }
}