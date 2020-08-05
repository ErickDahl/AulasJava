package Enum;

public enum TipoServico {
    OLEO("Troca de oleo", 100) , LAVAGEM("Lavagem do carro", 50) , REVISAO("Revisão do carro", 200);  

    private String tipoDeServico;
    private double valorPorServico;

    private TipoServico(String tipoDeServico, double valorPorServico) {
        this.tipoDeServico = tipoDeServico;
        this.valorPorServico = valorPorServico;
    }

    public String getTipoDeServico() {
        return tipoDeServico;
    }

    public double getValorPorServico() {
        return valorPorServico;
    }   
}