package Enum;

public enum PeriodoCurso {
    INTEGRAL("Terça e quinta", 40, 3000), NOTURNO("Quarta e sexta",20, 1200), MANHÃ("Sexta",20, 2000);
    private String diasDaSemana;
    private int cargaHoraria;
    private double valorCurso;

    private PeriodoCurso(String diasDaSemana, int cargaHoraria, double valorCurso) {
        this.diasDaSemana = diasDaSemana;
        this.cargaHoraria = cargaHoraria;
        this.valorCurso = valorCurso;
    }

    public String getDiasDaSemana() {
        return diasDaSemana;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValorCurso() {
        return valorCurso;
    }

    
    
    
}