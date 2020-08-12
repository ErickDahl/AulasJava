package Interface_Abstrato;

public class TestaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Marco Antonio", "Cisco CCNA", 85.00);
        Livro livro2 = new Livro("Kathy Sierra", "Use a cabeça Java", 98.00);

        Operecao operecao1 = new Operecao("Venda",livro1);
        Operecao operecao2 = new Operecao("Empréstimo", livro2);

        livro1.reajusteValor(6);

        operecao1.operacaoLivro();
        operecao2.operacaoLivro();

        System.out.println(operecao1);
        System.out.println(operecao2);
    } 
}