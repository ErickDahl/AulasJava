package Persistence;

import java.util.Scanner;

import Model.Veiculo;

public class MainVeiculo {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scEntrada = new Scanner(System.in);
        int menu;
        String marca, modelo;
        Veiculo veiculo = new Veiculo();
        VeiculoDao veiculoDao;

        do{
            exibirMenu();
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Marca: ");
                    marca = scEntrada.nextLine();
                    System.out.println("Modelo");
                    modelo = scEntrada.nextLine();
                    veiculoDao = new VeiculoDao();
                    veiculo = new Veiculo(null,marca,modelo);
                    veiculoDao.adicionar(veiculo);
                    break;

                case 2:
                    System.out.println("=============Listagem de Veiculos=============");
                    veiculoDao = new VeiculoDao();
                    for(Veiculo v : veiculoDao.listar()){
                        System.out.println(v.toString());
                    }
                    break;
                case 3:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        }while(menu != 3);      
    }

    public static void exibirMenu() {
        System.out.println("=============Sistema Veiculos=============");
        System.out.println("1-Adicionar");
        System.out.println("2-Listar");
        System.out.println("3-sair");
    }
}