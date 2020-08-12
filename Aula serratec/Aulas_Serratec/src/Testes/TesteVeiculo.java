package Testes;

import Herenca.Caminhao;
import Herenca.Moto;
import Herenca.VeiculoPasseio;

public class TesteVeiculo {
    public static void main(String[] args) {
        VeiculoPasseio vp = new VeiculoPasseio( "ABC-123", 2);
        vp.setChassi("123456");
        vp.setIPVA(800);
        
        System.out.println(vp.getPlaca() + " " + vp.getIPVA());
        System.out.println("Valor seguro: " + vp.CalcularSeguro());

        Caminhao c = new Caminhao("BCA-123", 1000);
        c.setIPVA(2000);

        System.out.println(c.getPlaca() + " " + c.getIPVA());
        System.out.println("Valor seguro: " + c.CalcularSeguro());

        Moto moto = new Moto("PDC-123");
        moto.setIPVA(500);

    

    }
}