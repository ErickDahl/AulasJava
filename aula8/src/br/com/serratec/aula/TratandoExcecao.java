package br.com.serratec.aula;

public class TratandoExcecao {

	public static void main(String[] args) {
		int vetor[] = { 1, 4, 2 };
		int a = 10;
		int b = 2;
		int c = 0;
		String d = "teste";

		try {
			c = a / b;
			System.out.println("Resultado:" + c);
			System.out.println("Resultado" + vetor[2]);
			System.out.println("Resultado:" + d.equals("teste"));
		} catch (ArithmeticException e) {
			System.out.println("Erro divisão por zero !!");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Vetor fora de faixa");
		} catch (Exception e) {
			System.out.println("Erro de Null Point - Não  instanciou");
		}

	}

}
