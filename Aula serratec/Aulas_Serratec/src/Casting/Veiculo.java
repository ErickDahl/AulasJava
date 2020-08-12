package Casting;

public class Veiculo {
    protected String modelo;
    protected String placa;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo [modelo=" + modelo + ", placa=" + placa + "]";
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
    
    public boolean equals(Object outro){
        if(!(outro instanceof Veiculo)){
            return false;
        }
        else{
            VeiculoPasseio vp = (VeiculoPasseio) outro;
            return this.modelo == vp.modelo && this.placa == vp.placa;
        }
    } 
}