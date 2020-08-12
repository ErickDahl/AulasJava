package TryCatch;

public class Produto {
    private int codigo;
    private String descricao;
    private double valor;
    private Categoria categoria;
    private int quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Produto(int codigo, String descricao, double valor, Categoria categoria, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}