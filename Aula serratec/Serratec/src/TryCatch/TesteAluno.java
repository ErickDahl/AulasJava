package TryCatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        List<Aluno> Alunos = new ArrayList<Aluno>();
        boolean continuar = true;

        try {
            System.out.println("Insira um aluno");
            System.out.println("---------------------------");
            do {
                System.out.println("Insira o nome do aluno");
                String nome = dados.next();
                System.out.println("Insira a primeira nota do aluno");
                double nota1 = dados.nextDouble();
                System.out.println("Insira a segunda nota do aluno");
                double nota2 = dados.nextDouble();
                System.out.println("Deseja inserir mais um aluno?  true/false");
                continuar = dados.nextBoolean();

                Aluno aluno = new Aluno(nome, nota1, nota2);
                Alunos.add(aluno);

                System.out.println("\n");

                if(continuar){
                    System.out.println("Insira mais um aluno");
                    System.out.println("---------------------------");
                }
            } while (continuar);

            System.out.println("--------------------------------------");
            for (Aluno a : Alunos) {
                System.out.println(" Nome do Aluno: " + a.getNome());
                System.out.println(" Primeira nota do aluno: " + a.getNota1());
                System.out.println(" Segunda nota do aluno: " + a.getNota2());
                System.out.println(" Média do aluno: " + a.calculaMedia());
                System.out.println("--------------------------------------");
            }
        } catch (AlunoException e) {
            System.out.println(e.getMessage());
            System.out.println("--------------------------------------");
        }
        dados.close();
    }
}