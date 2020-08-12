package Interface_Abstrato;

public class ContaCorrente implements Conta {
    private double saldo;
    private String titular;

    public ContaCorrente(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    @Override
    public void depositarConta(double valor) {
        saldo += valor;

    }

    @Override
    public void sacarConta(double valor) {
        if(saldo < valor){
            System.out.println("Saldo insuficiente");
        }
        else{
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "ContaCorrente [saldo=" + saldo + ", titular=" + titular + "]";
    }
}