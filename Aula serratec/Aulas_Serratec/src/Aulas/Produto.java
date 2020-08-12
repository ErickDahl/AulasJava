package Aulas;

public class Produto {
    private int codigo;
    private String descricao;
    private double valor;
    
    public Produto(){

    }

    public Produto(int codigo, String descricao, double valor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto(String descricao){
        this.descricao = descricao;
    }
}