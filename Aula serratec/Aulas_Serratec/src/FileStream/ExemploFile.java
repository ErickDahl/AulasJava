package FileStream;

import java.io.File;
import java.util.Scanner;

public class ExemploFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Diretório ou do Arquivo");
        String nome = sc.nextLine();
        File file = new File(nome);
        
        if(file.exists()){
            if(file.isFile()){
                System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes\n",file.getName(), file.length());
                
            }else{
                System.out.println("\nConteudo do Diretório");
                String[] diretorio = file.list();
                for(String conteudo : diretorio){
                    System.out.printf("%s\n", conteudo);
                }
            }
        }else{
            System.out.println("Arquivo ou diretório incorretos!");
        }
        sc.close();
    }  
}