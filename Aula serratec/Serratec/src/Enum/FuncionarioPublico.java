package Enum;

public class FuncionarioPublico {
    private String nome;
    private double salario;
    private String estadoCivil;
    private final String anoConcurso;
    private static double totalPago;

    public FuncionarioPublico(String nome, double salario, String estadoCivil, String anoConcurso) {
        this.nome = nome;
        this.salario = salario;
        this.estadoCivil = estadoCivil;
        this.anoConcurso = anoConcurso;
        totalPago += salario;
    }

    @Override
    public String toString() {
        return "FuncionarioPublico [anoConcurso=" + anoConcurso + ", estadoCivil=" + estadoCivil + ", nome=" + nome
                + ", salario=" + String.format("%.2f", salario) + "]";
    }

    public void adicionaSalario(double valor) {
        salario = salario * 1.1 + valor;
        totalPago = totalPago + salario * 0.1 + valor;
    }

    public static double getTotalPago() {
        return totalPago;
    }
}