package TryCatch;

import java.time.LocalDate;

public class TesteVenda {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Tv", 3000, Categoria.ELETRÔNICO, 2);
        Produto produto2 = new Produto(2, "Pneu", 800, Categoria.AUTOMOTIVO, 1);
        Produto produto3 = new Produto(3, "Celular", 2500, Categoria.ELETRÔNICO, 1);

        Venda venda1 = new Venda(new Produto[3], LocalDate.now());

        venda1.inserirProduto(produto1);
        venda1.inserirProduto(produto2);
        venda1.inserirProduto(produto3);
        venda1.calcularVenda();
        venda1.MostrarVenda();
    }
}