package br.com.serratec.aula;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Serializable;

public class LeituraArquivo implements Serializable{

	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileReader fr = new FileReader("c:\\teste\\exercicios.txt");
			System.out.println("foi");
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println("fulano coloca o caminho certo !!");
			e.printStackTrace();
		}
	}
}
