package br.com.serratec.exercicios;

public final class EnsinoMedio extends ColegioAplicacao {
	private int numeroAlunos;

	public EnsinoMedio(String nomeUniversidade, String nomeCoordenador, int numeroAlunos) {
		super(nomeUniversidade, nomeCoordenador);
		this.numeroAlunos = numeroAlunos;
	}

	public int getNumeroAlunos() {
		return numeroAlunos;
	}

	@Override
	public void reuniaoPais() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub

	}

}
