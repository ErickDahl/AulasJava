package br.com.serratec.aula10;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String responsavel;
	private List<Livro> listaLivros = new ArrayList<Livro>();

	public String getResponsavel() {
		return responsavel;
	}

	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	public void adicionar(Livro livro) {
		listaLivros.add(livro);
	}

	public void listar() {
		for (Livro livro : listaLivros) {
			System.out.println(livro.getAutor() + " " + livro.getTitulo() + " " + livro.getPreco());
		}
	}

	public int pesquisarFaixaDePreco(double valorInicial, double valorFinal) {
		int quantidade = 0;
		for (Livro livro : listaLivros) {
			if (livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal) {
				quantidade++;
			}
		}
		return quantidade;
	}

	public double calcularTotalLivros() {
		double total = 0;
		for (Livro livro : listaLivros) {
			total += livro.getPreco();
		}
		return total;
	}
}
