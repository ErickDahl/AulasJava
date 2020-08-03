package Herenca;

public class veiculo {
   protected String chassi;
   protected String placa;
   protected String cor;
   protected double IPVA;

   public veiculo( String placa) {
       this.placa = placa;
   }

   public String getChassi() {
       return chassi;
   }

   public void setChassi(String chassi) {
       this.chassi = chassi;
   }

   public String getPlaca() {
       return placa;
   }

   public void setPlaca(String placa) {
       this.placa = placa;
   }

   public String getCor() {
       return cor;
   }

   public void setCor(String cor) {
       this.cor = cor;
   }

   public double getIPVA() {
       return IPVA;
   }

   public void setIPVA(double iPVA) {
       IPVA = iPVA;
   } 
   
   public double CalcularSeguro(){
       return IPVA * 0.01;
   }
}