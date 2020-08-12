package Herenca;

public class Gerente extends Funcionario{
    private String senha;
    private String numeroDeFuncionariosGerenciados;

    public Gerente(String nome, int cpf, double salario, String senha, String numeroDeFuncionariosGerenciados) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
}