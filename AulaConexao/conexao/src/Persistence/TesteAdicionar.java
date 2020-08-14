package Persistence;

import Control.ControleCliente;
import Model.Cliente;

public class TesteAdicionar {

	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		ControleCliente controleCliente = new ControleCliente();
		Cliente cliente = new Cliente(null, "Adriano", "2242-1050", "ad@hotmail.com");
		controleCliente.adicionar(cliente);
	}
}
