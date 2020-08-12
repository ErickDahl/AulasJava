package Herenca;

public class Caminhao extends veiculo{
    private int cargaMaxima;

    public Caminhao( String placa, int cargaMaxima) {
        super(placa);
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public void CalculaIPVA(){
        IPVA *= 1.10;
    }
    
}