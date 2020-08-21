package org.serratec.trabalho.trabalho_prova.Domain;

public class Conta {
    private Integer numero;
    private String titular;
    private double valor;

    public String getTitular() {
        return titular;
    }

    public void setTitula(String titular) {
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Conta(Integer numero, String titular, double valor) {
        this.numero = numero;
        this.titular = titular;
        this.valor = valor;
    }
}