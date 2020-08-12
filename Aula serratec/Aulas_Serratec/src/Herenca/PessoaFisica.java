package Herenca;

public class PessoaFisica extends ImpostoDeRenda {
    private String cpf, rg;

    public PessoaFisica(String nome, double rendimento, String cpf, String rg) {
        super(nome, rendimento);
        this.cpf = cpf;
        this.rg = rg;
    }

    //!Muito melhor para escrever várias pessoas. Sem a necessidade de Get e Set
    /*
    @Override
    public String toString() {
        return "Pessoa Física \nNome: " + nome + "\nCPF: " + cpf + "\nRG: " + rg + "\nValor a Pagar: " + CalculoIr();
    }
    */
    
    @Override
    public double CalculoIr() {
        return super.CalculoIr() * 0.12;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}