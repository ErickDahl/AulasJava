package Herenca;

public class Moto extends veiculo{

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public double CalcularSeguro(){
        return super.CalcularSeguro() + 200;
    }
}