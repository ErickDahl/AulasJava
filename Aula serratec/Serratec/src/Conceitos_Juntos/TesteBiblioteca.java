package br.com.serratec.aula10;
import java.util.Scanner;

public class TesteBiblioteca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		int menu;
		double preco, valorInicial, valorFinal;
		Livro livro;
		String titulo, autor;
		Biblioteca biblioteca = new Biblioteca();
		do {
			exibirMenu();
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.print("Titulo:");
				titulo = entradaString.nextLine();
				System.out.print("Autor:");
				autor = entradaString.nextLine();
				System.out.print("Preço:");
				preco = sc.nextDouble();

				livro = new Livro(titulo, autor, preco);
				biblioteca.adicionar(livro);
				break;
			case 2:
				System.out.println("\n========Listagem de Livros============");
				biblioteca.listar();
				System.out.println("======================================");
				break;
			case 3:
				System.out.println("========Pesquisa por faixa de preço======");
				System.out.print("Digite o valor inicial:");
				valorInicial = sc.nextDouble();
				System.out.print("Digite o valor final:");
				valorFinal = sc.nextDouble();
				
				System.out.println("Existem" + biblioteca.pesquisarFaixaDePreco(valorInicial, valorFinal) + " livros");
				break;
			case 4:
				System.out.println("Total de livros:" + biblioteca.calcularTotalLivros());

				break;
			case 5:
				System.out.println("Saindo do sistema");
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}
		} while (menu != 5);

	}

	public static void exibirMenu() {
		System.out.println("*******BIBLIOTECA DA FACULDADE*******");
		System.out.println("1-Adicionar");
		System.out.println("2-Listar");
		System.out.println("3-Pesquisar por Preço");
		System.out.println("4-Calcular Total");
		System.out.println("5-Sair");
		System.out.println("Digite a opção:");
	}

}


