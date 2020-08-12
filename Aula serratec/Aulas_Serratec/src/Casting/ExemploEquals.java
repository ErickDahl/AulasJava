package Casting;

public class ExemploEquals {
    public static void main(String[] args) {
        Veiculo v1 = new VeiculoPasseio("Onix", "ABC");  
        Veiculo v2 = new VeiculoPasseio("Onix", "ABC"); 
        
        if((v1.equals(v2))){
            System.out.println("Iguais");
        } else{
            System.out.println("Diferentes");
        }

        if(v1.getPlaca().equals(v2.getPlaca())){
            System.out.println("Iguais");
        } else{
            System.out.println("Diferentes");
        }
    }
}