package Enum;

import java.time.LocalDate;

public class Moto extends Veiculo {
    private int cilindradas;

    @Override
    public double lavarVeiculo() {
        return valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
    }

    @Override
    public double revisao() {
        return valorCobrado += TipoServico.REVISAO.getValorPorServico();
    }

    @Override
    public double trocarOleo() {
        return valorCobrado += TipoServico.OLEO.getValorPorServico();
    }

    @Override
    public String toString() {
        return "Moto [cilindradas=" + cilindradas + "]";
    }

    public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
        super(modelo, dataConserto, proprietario);
        this.cilindradas = cilindradas;
    }

    
    
}