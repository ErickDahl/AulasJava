package Interface_Abstrato;

public class Operecao implements Livraria {
    private String tipo;
    private double valorOperacao;
    private Livro livro;
    private boolean error = false;

    public Operecao(String tipo, Livro livro) {
        this.tipo = tipo.toLowerCase();
        this.livro = livro;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        if(error == true){
            return "Tipo de operação inválida";
        }else{
        return "Tipo:" + tipo + " " + "Valor:" + String.format("%.3f", valorOperacao) + " " + "Autor:"
                + livro.getAutor() + " " + "Título:" + livro.getTitulo();
        }
    }

    @Override
    public void operacaoLivro() {
        if(tipo.equals("venda")){
            valorOperacao = livro.getValor() * 1.09;
        }
        else if(tipo.equals("empréstimo") || tipo.equals("emprestimo")){
            valorOperacao = livro.getValor() * 0.02 + taxaEmprestimo;
        }
        else{
            error = true;
        }
    }
}