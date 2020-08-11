package FileStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ExemploBinarioEscrever {
    public static void main(String[] args) {
        try {
            FileInputStream arq = new FileInputStream("d:\\AulasJava\\Textos\\arquivo.dat");
            DataInputStream LerArq = new DataInputStream(arq);
        
            String resultado = LerArq.readLine();
            System.out.println(resultado);
            LerArq.close();

        } catch (IOException e) {
            System.out.println("Arquivo não encontrado");
        }
    }
}