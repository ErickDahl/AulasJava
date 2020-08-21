package org.serratec.trabalho.trabalho_prova.Domain;

public class Operacao {
    private String operacao;
    private double valor;

    public Operacao(String operacao, double valor) {
        this.operacao = operacao;
        this.valor = valor;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }  
}