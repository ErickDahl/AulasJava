package Herenca;

import java.time.LocalDate;

public class Pedido {
    protected int numero;
    protected LocalDate dataPedido;
    protected double quantidade;
    protected double valor;
    protected static double total;
    protected static double totalValor;

    public Pedido(int numero, LocalDate dataPedido, double quantidade, double valor) {
        this.numero = numero;
        this.dataPedido = dataPedido;
        this.quantidade = quantidade;
        this.valor = valor;
        total++;
    }

    public void finalizarPedido(){
        if(dataPedido.getDayOfWeek().name().equals("SUNDAY")){
            valor *= 0.9 * quantidade;
            totalValor += valor;
        }
        else{
            valor *= quantidade;
            totalValor += valor;
        }
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }


    public double getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public static double getTotal() {
        return total;
    }

    public static double getTotalValor() {
        return totalValor;
    }
}