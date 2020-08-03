package aula2;

public class SituacaoAluno {
    public static void main(String[] args) {
        double nota1 = 9;
        double nota2 = 5;

        double media = (nota1 + nota2)/2;

        System.out.println(media);

        if(media >= 7){
            System.out.println("Aprovado");
        }
        else if(media == 10)
        {
            System.out.println("Parabéns");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
