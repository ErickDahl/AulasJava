package br.com.serratec.exercicios;

public final class Direito extends Faculdade implements OAB, Eventos {
	private int tempoDuracao;
	
	
	public Direito(String nomeUniversidade, String nomeFaculdade, int bloco, int tempoDuracao) {
		super(nomeUniversidade, nomeFaculdade, bloco);
		this.tempoDuracao = tempoDuracao;
	}

	
	@Override
	public String toString() {
		return "Direito [tempoDuracao=" + tempoDuracao + "]";
	}


	public int getTempoDuracao() {
		return tempoDuracao;
	}


	@Override
	public String matrizCurricular() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub

	}


	@Override
	public String programacao() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void eventos() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean realizarProva() {
		// TODO Auto-generated method stub
		return false;
	}

}
