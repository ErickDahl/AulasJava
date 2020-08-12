package Herenca;

public class Assistente extends Funcionario {
    private String tipo;

    public Assistente(String nome, int cpf, double salario, String tipo) {
        super(nome, cpf, salario);
        this.tipo = tipo;
    } 
}