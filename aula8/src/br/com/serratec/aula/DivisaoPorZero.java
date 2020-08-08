package br.com.serratec.aula;

public class DivisaoPorZero {

	//throws o erro é encaminhado para o método que chamar este método 
	public static int divisao(int i, int j) throws ArithmeticException {
		return i / j;
	}
	

	public static void main(String[] args) {
		try {
			System.out.println(divisao(20, 1));	
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println("Erro divisão por zero !!");
		}finally {
			System.out.println("Sempre Executa");
		}
		
	}

}
