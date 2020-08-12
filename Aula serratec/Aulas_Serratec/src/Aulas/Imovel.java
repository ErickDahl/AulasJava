package Aulas;

public class Imovel {
    public int codigoImovel;
    public String bairro;
    public String tipo;
    public double valor;

    @Override
    public String toString() {
        return "Imovel   CódigoImovel= " + codigoImovel + "Bairro " + bairro + "Tipo " + tipo + "Valor " + valor;
    }

    public void CalculaReajuste(){
        if(tipo == "Apartamento"){
            valor *= 1.05;
        }
        else
        {
            valor *= 1.08;
        }
    }

    public String mostraCategoria(){
        String categoria;

        if(valor > 50000){
            categoria = "A";
        }
        else if(valor >= 25000 && valor <= 50000){
            categoria = "B";
        }
        else{
            categoria = "C";
        }
        return categoria;
    }
}
