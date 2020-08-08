package br.com.serratec.aula;

public class TesteConta {

	public static void main(String[] args) {
		try {
			Conta conta = new ContaCorrente("123456", 5000);

			conta.depositaConta(100);

			conta.saqueConta(60);
			System.out.println(conta.toString());

		} catch (SaldoNegativo e) {
			System.out.println(e.getMessage());
		}
	}

}
