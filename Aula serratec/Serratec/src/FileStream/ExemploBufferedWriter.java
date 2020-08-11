package FileStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploBufferedWriter {
    public static void main(String[] args) {
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("d:\\AulasJava\\teste.txt"));
            bf.append("tudo bem?");
            bf.write(" como vai?");
            bf.close();
            System.out.println("Arquivo criado e texto inserido");
        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo");
        }
    }
}