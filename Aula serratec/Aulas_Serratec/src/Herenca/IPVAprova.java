package Herenca;

public class IPVAprova extends VeiculoProva {
    private double valorIPVA;
    private double taxaLicenciamento;

    public void calculaIPVA(){
        if(combustivel.equals("gás") && valorVeiculo != 0 ){
            valorIPVA = valorVeiculo * 0.01 + taxaLicenciamento;
        }
        else if (combustivel.equals("flex") && valorVeiculo != 0){
            valorIPVA = valorVeiculo * 0.03 + taxaLicenciamento;
        }
        else if(combustivel.equals("gasolina") && valorVeiculo != 0){
            valorIPVA = valorVeiculo * 0.04 + taxaLicenciamento;
        }
        else{
            valorIPVA = 0;
        }
    }

    public double getValorIPVA() {
        return valorIPVA;
    }

    public double getTaxaLicenciamento() {
        return taxaLicenciamento;
    }

    public IPVAprova(String modelo, String placa, String combustivel, double valorVeiculo,double taxaLicenciamento) {
        super(modelo, placa, combustivel, valorVeiculo);
        this.taxaLicenciamento = taxaLicenciamento;
    }

    @Override
    public String toString() {
        if(valorIPVA != 0){
            return "Modelo:" + modelo + " Placa:" + placa + " Combustível:" + combustivel + 
        " Valor do veículo:" + valorVeiculo + "\nTx de Licenciamento:" + taxaLicenciamento + " Valor do IPVA:"
         + valorIPVA +"\n -------------------------------------------------------------------------------";
        } else{
            return "Error --- Por favor verifique os dados do combustível ou valor do veículo " + modelo;
        }     
    }
}