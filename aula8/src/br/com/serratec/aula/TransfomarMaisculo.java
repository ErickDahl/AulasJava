package br.com.serratec.aula;

public class TransfomarMaisculo {

	public static void main(String[] args) {
		String fraseInicial = null;
		String fraseFinal = null;

		try {
			fraseFinal = fraseInicial.toUpperCase();
			System.out.println("Resultado:" + fraseFinal);
		} catch (Exception e) {
			System.out.println("Erro ao transformar a frase !!");
			System.out.println(e);
		}

	}

}
