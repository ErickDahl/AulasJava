package Aulas;

import java.util.Scanner;

public class exemploTernario2 {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("Qual o seu dia da semana favorito");
        int num = sw.nextInt();

        String dia = (num == 1) ? "Segunda" :
                     (num == 2) ? "Terça"   :
                     (num == 3) ? "Quarta"  :
                     (num == 4) ? "Quinta"  :
                     (num == 5) ? "Sexta"   :
                     (num == 6) ? "Sábado"  :
                     (num == 7) ? "Domingo" : "Dia inválido";
        
        System.out.println("Meu dia favorito é " + dia);
    }
}