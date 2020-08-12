package Testes;

import Herenca.IPVAprova;
import Herenca.VeiculoProva;

public class TesteProva {
    public static void main(String[] args) {
        VeiculoProva veiculo1 = new IPVAprova("FOCUS", "ABC-123", "GÁS", 10000, 100);
        VeiculoProva veiculo2 = new IPVAprova("CIVIC", "BCA-123", "flex", 10000, 100);
        VeiculoProva veiculo3 = new IPVAprova("MUSTANG", "DBA-123", "Gasolina", 10000, 100);
        VeiculoProva veiculo4 = new IPVAprova("208", "PDE-123", "Elétrico", 10000, 100);
        VeiculoProva veiculo5 = new IPVAprova("Onix", "QCA-123","Gasolina", 0, 100);
  
        ((IPVAprova) veiculo1).calculaIPVA();
        ((IPVAprova) veiculo2).calculaIPVA();
        ((IPVAprova) veiculo3).calculaIPVA();
        ((IPVAprova) veiculo4).calculaIPVA();
        ((IPVAprova) veiculo5).calculaIPVA();

        System.out.println(veiculo1);
        System.out.println(veiculo2);
        System.out.println(veiculo3);
        System.out.println(veiculo4);
        System.out.println(veiculo5);
    } 
}