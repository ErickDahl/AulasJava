package br.com.serratec.exercicios;

public abstract class Universidade {
	protected String nomeUniversidade;

	public Universidade(String nomeUniversidade) {
		super();
		this.nomeUniversidade = nomeUniversidade;
	}

	
	
	@Override
	public String toString() {
		return "Universidade [nomeUniversidade=" + nomeUniversidade + "]";
	}


	public String getNomeUniversidade() {
		return nomeUniversidade;
	}
	
	public abstract void fazerMatricula();
	
}
