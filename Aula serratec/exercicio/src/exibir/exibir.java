package exibir;

import conta.conta;

public class exibir {
    public static void main(String[] args) {
     conta conta = new conta();
        conta.titular = "Erick";
        conta.numero = 123456;
        conta.saldo = 100;
        
        conta.deposito(100);
        conta.saque(50);

        System.out.println(conta);
    }
}