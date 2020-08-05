package Enum;

public class TesteTurma {
    public static void main(String[] args) {
        Turma turma1 = new Turma("Engenharia", PeriodoCurso.INTEGRAL); 
        Turma turma2 = new Turma("React", PeriodoCurso.MANHÃ);

        System.out.println(turma1);
        System.out.println(turma2);
    }
}