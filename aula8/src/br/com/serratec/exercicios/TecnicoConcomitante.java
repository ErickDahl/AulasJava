package br.com.serratec.exercicios;

public final class TecnicoConcomitante extends ColegioAplicacao {
	private String nomeCurso;

	public TecnicoConcomitante(String nomeUniversidade, String nomeCoordenador, String nomeCurso) {
		super(nomeUniversidade, nomeCoordenador);
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reuniaoPais() {
		// TODO Auto-generated method stub

	}

}
