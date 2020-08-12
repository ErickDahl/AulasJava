package Herenca;

public class ImpostoDeRenda {
    protected String nome, telefone, email;
    protected double rendimento;

    public ImpostoDeRenda(String nome, double rendimento) {
        this.nome = nome;
        this.rendimento = rendimento;
    }

    public double CalculoIr() {
        return rendimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}