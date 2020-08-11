package FileStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExemploBinario {
    public static void main(String[] args) {
        try {
            FileOutputStream arq =  new FileOutputStream("Textos\\arquivo.dat");
            DataOutputStream gravarArq = new DataOutputStream(arq);  
            gravarArq.writeChars("Bom dia");
            gravarArq.close();
            System.out.println("Arquivo criado com sucesso");

        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo");
        }  
    }
}