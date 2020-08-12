package Aulas;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private double peso;
    private double altura;

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    
    private double CalculaImc(){
        double imc = peso/(altura * altura);
        return imc;
    }

    public String MostraImc(){
        String resultado;

        if(CalculaImc() < 18.5){
            resultado = "Abaixo do peso";
        }
        else if(CalculaImc() > 18.5 && CalculaImc() < 24.9){
            resultado = "Peso normal";
        }
        else{
            resultado = "Acima do peso";
        }
        return resultado;
    }
}