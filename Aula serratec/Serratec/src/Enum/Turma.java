package Enum;

public class Turma {
    private String nomeDoCurso;
    private PeriodoCurso periodoCurso;

    public Turma(String nomeDoCurso, PeriodoCurso periodoCurso) {
        this.nomeDoCurso = nomeDoCurso;
        this.periodoCurso = periodoCurso;
    }

    @Override
    public String toString() {
        return "Turma [nomeDoCurso=" + nomeDoCurso + ", periodoCurso=" + periodoCurso + "]";
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public PeriodoCurso getPeriodoCurso() {
        return periodoCurso;
    }   
}