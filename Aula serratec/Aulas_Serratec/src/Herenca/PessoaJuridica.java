package Herenca;

public class PessoaJuridica extends ImpostoDeRenda {
    private String cnpj, inscEstadual;

    public PessoaJuridica(String nome, double rendimento, String cnpj, String inscEstadual) {
        super(nome, rendimento);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
    }

    //!Muito melhor para escrever várias pessoas. Sem a necessidade de Get e Set
   /* @Override
    public String toString() {
        return "Pessoa Jurídica \nNome: " + nome + "\nCNPJ: " + cnpj + "\nInscrição Estadual: " + inscEstadual + "\nValor a Pagar: " + CalculoIr();
    }
    */

    @Override
    public double CalculoIr() {
        return super.CalculoIr() * 0.15;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }
}