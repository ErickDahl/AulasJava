package Enum;

import java.time.LocalDate;

public class Carro extends Veiculo {
    private String categoria;

    public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
        super(modelo, dataConserto, proprietario);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public double lavarVeiculo() {
       return valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
    }

    @Override
    public double revisao() {
        if(dataConserto.getMonth().name().equals("AUGUST")){
           return valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico() * 0.9;
        }
        return valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
    }

    @Override
    public double trocarOleo() {
        if(dataConserto.getDayOfWeek().name().equals("SATURDAY")){
          return valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico() - 50;
        }
        return valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
    }

    @Override
    public String toString() {
        return "Proprietário: " + proprietario.getNome() + " " + "Modelo: " + modelo + " " + "Categoria: " + categoria + " " + "Valor cobrado: " + valorCobrado;
    } 
}