package Interface_Abstrato;

public class Poupanca implements Conta {
    private double saldo;
    private String titular;

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

    @Override
    public String toString() {
        return "Poupanca [saldo=" + saldo + ", titular=" + titular + "]";
    }

    public Poupanca(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }  
}