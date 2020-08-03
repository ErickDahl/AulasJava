package aula1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class exemplo {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println("oi");
		System.out.println("Java" + 1);

		Date data = new Date();
		System.out.println(data);
		List lista = new ArrayList<>();

		lista.add(4);
		System.out.println(lista);

		int a = 0;

		if (a == 0) {
			System.out.println("é 0");
		} else {
			System.out.println("é outra coisa");
		}
	}
}