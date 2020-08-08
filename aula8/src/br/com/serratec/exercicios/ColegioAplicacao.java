package br.com.serratec.exercicios;

public abstract class ColegioAplicacao extends Universidade {
	protected String nomeCoordenador;

	public ColegioAplicacao(String nomeUniversidade, String nomeCoordenador) {
		super(nomeUniversidade);
		this.nomeCoordenador = nomeCoordenador;
	}

	public String getNomeCoordenador() {
		return nomeCoordenador;
	}

	public abstract void reuniaoPais();
}
