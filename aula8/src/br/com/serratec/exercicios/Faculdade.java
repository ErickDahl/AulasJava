package br.com.serratec.exercicios;

public abstract class Faculdade extends Universidade {
	protected String nomeFaculdade;
	protected int bloco;

	public Faculdade(String nomeUniversidade, String nomeFaculdade, int bloco) {
		super(nomeUniversidade);
		this.nomeFaculdade = nomeFaculdade;
		this.bloco = bloco;
	}

	@Override
	public String toString() {
		return super.toString()+ "Faculdade [nomeFaculdade=" + nomeFaculdade + ", bloco=" + bloco + "]";
	}

	public String getNomeFaculdade() {
		return nomeFaculdade;
	}

	public int getBloco() {
		return bloco;
	}

	public abstract String matrizCurricular();
	
}
