package Testes;

import java.time.LocalDate;

import Herenca.Pedido;

public class TestePedido {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1, LocalDate.of(2020, 7, 26), 1, 100);
        Pedido pedido2 = new Pedido(2, LocalDate.of(2020, 7, 27), 2, 100);
        Pedido pedido3 = new Pedido(3, LocalDate.of(2020, 7, 26), 3, 300); 

        pedido1.finalizarPedido();
        pedido2.finalizarPedido();
        pedido3.finalizarPedido();
        
        System.out.println( "Total de pedidos Realizados: " + Pedido.getTotal());

        System.out.println("Valor total do Pedido " + pedido1.getNumero() + ": " + pedido1.getValor());
        System.out.println("Valor total do Pedido " + pedido2.getNumero() + ": " + pedido2.getValor());
        System.out.println("Valor total do Pedido " + pedido3.getNumero() + ": " + pedido3.getValor());
        System.out.println("Valor total de todos os pedidos é:" + Pedido.getTotalValor());
    }
}