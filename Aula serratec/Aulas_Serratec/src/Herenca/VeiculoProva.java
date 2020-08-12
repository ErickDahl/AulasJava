package Herenca;

public class VeiculoProva {
    protected String modelo;
    protected String placa;
    protected String combustivel;
    protected double valorVeiculo;

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public VeiculoProva(String modelo, String placa, String combustivel, double valorVeiculo) {
        this.modelo = modelo;
        this.placa = placa;
        this.combustivel = combustivel.toLowerCase();
        this.valorVeiculo = valorVeiculo;
    } 
}