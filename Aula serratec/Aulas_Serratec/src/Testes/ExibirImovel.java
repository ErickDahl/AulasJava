package Testes;

import Aulas.Imovel;

public class ExibirImovel {
    public static void main(String[] args) {
        Imovel imovel1 = new Imovel();
        Imovel imovel2 = new Imovel();


        imovel1.codigoImovel = 1;
        imovel1.bairro = "Centro";
        imovel1.tipo = "Apartamento";
        imovel1.valor = 85900;

        imovel2.codigoImovel = 2;
        imovel2.bairro = "Várzea";
        imovel2.tipo = "Casa";
        imovel2.valor = 25600;
        
        imovel1.CalculaReajuste();
        imovel2.CalculaReajuste();

        System.out.println("O imovel 1 pertence a categoria: " + imovel1.mostraCategoria());
        System.out.println("O imovel 2 pertence a categoria: " + imovel2.mostraCategoria());
    }
}