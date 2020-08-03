package conta;

public class conta {
    public String titular;
    public double numero;
    public double saldo;
    
    
    @Override
    public String toString() {
        return " Conta: Conta " + titular + " numero " + numero + " saldo " + saldo;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public boolean saque(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
}