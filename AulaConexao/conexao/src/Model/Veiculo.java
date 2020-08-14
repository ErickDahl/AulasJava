package Model;

public class Veiculo {
    private Integer codigo;
    private String marca;
    private String modelo;

    public Veiculo(Integer codigo, String marca, String modelo) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Veiculo(){
        
    }

    
    /** 
     * @return Integer
     */
    public Integer getCodigo() {
        return codigo;
    }

    
    /** 
     * @return String
     */
    public String getMarca() {
        return marca;
    }

    
    /** 
     * @return String
     */
    public String getModelo() {
        return modelo;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", codigo=" + codigo + "]";
    }

    
    
}