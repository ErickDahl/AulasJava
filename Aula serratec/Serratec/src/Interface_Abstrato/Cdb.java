package Interface_Abstrato;

public class Cdb implements Conta {
    private String titular;
    private double saldo;
    private double iof;

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
            saldo -= valor - iof;
        }

    }

    public Cdb(String titular, double saldo, double iof) {
        this.titular = titular;
        this.saldo = saldo;
        this.iof = iof;
    }

    @Override
    public String toString() {
        return "Cdb [iof=" + iof + ", saldo=" + saldo + ", titular=" + titular + "]";
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getIof() {
        return iof;
    }
}