package Enum;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina{
    protected String modelo;
    protected double valorCobrado = 0;
    protected LocalDate dataConserto;
    protected Proprietario proprietario;

    public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
        this.modelo = modelo;
        this.dataConserto = dataConserto;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Veiculo [dataConserto=" + dataConserto + ", modelo=" + modelo + ", proprietario=" + proprietario
                + ", valorCobrado=" + valorCobrado + "]";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    public LocalDate getDataConserto() {
        return dataConserto;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }    
}