package Control;

import Model.Cliente;
import Persistence.ClienteDao;

public class ControleCliente {
	
	/** 
	 * @param cliente
	 */
	public void adicionar(Cliente cliente) {
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.adicionar(cliente);
		System.out.println("Cliente Adicionado com sucesso !!");
	}
}
