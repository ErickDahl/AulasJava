package Aulas;

public class exemploTernario{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        if(a == b){
            System.out.println("são iguais");
        }
        else{
            System.out.print("são diferentes ");
        }
        System.out.println((a == b) ? "são iguais" : " são diferentes");        
    }
}