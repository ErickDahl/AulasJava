package TryCatch;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
    private Produto[] produto;
    private LocalDate dataCompra;
    private double totalVenda;

    @Override
    public void calcularVenda() {
        for(int i = 0; i < produto.length; i++){
            totalVenda += produto[i].getValor() * produto[i].getQuantidade();
        }
    }

    public void inserirProduto(Produto produtos){
        for(int i = 0; i < produto.length; i++){
            if(produto[i] == null){
                produto[i] = produtos;
                return;
            }
        }
    }

    public void MostrarVenda(){
        System.out.println("Total por item");
        System.out.println("---------------------------");
        for(int i = 0; i < produto.length; i++){
            System.out.println(produto[i].getDescricao() + " - " + produto[i].getValor() * produto[i].getQuantidade());
        }
        System.out.println("---------------------------");
        System.out.println("Total Geral Vendas: " + totalVenda);
    }

    public Venda(Produto[] produto, LocalDate dataCompra) {
        this.produto = produto;
        this.dataCompra = dataCompra;
    }

    @Override
    public String toString() {
        return "Venda [dataCompra=" + dataCompra + ", produto=" + produto +  "totalVenda=" + totalVenda + "]";
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public Produto[] getProduto() {
        return produto;
    }

}