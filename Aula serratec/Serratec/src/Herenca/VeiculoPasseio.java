package Herenca;

public class VeiculoPasseio extends veiculo {
    private int QuantidadePortas;

    public VeiculoPasseio(String placa, int quantidadePortas) {
        super(placa);
        QuantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return QuantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        QuantidadePortas = quantidadePortas;
    }  

    public void CalcularIPVA(){
        IPVA += 180;
    }
}