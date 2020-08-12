package Persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Cliente;

public class ClienteDao {
	private Connection connection;

	public ClienteDao() {
		connection = new ConnectionFactory().getConnection();
	}

	public void adicionar(Cliente cliente) {
		String sql = "insert into cliente values(null,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void apagar(int codigo) {
		String sql = "delete from cliente where codigo=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void atualizar(Cliente cliente) {
		String sql = "update cliente set nome=?,telefone=?,email=? where codigo=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.setInt(4, cliente.getCodigo());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public List<Cliente> listar() {
		String sql = "select * from cliente";
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Cliente cliente = new Cliente(rs.getInt("codigo"),
						rs.getString("nome"), 
						rs.getString("telefone"),
						rs.getString("email"));
				listaClientes.add(cliente);
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listaClientes;

	}

	public static void main(String[] args) {
		ClienteDao clienteDao = new ClienteDao();
		System.out.println(clienteDao.listar());
		//Cliente cliente = new Cliente(2, "Amarildo", "2222-1525", "amarildo@hotmail.com");
		//clienteDao.atualizar(cliente);
//		clienteDao.apagar(1);
		// System.out.println("Cliente deletado com sucesso !!");
		// Cliente cliente = new Cliente(null, "Ana Maria", "2234-1009",
		// "am@gmail.com");
		// clienteDao.adicionar(cliente);
//		System.out.println("Cliente adicionado com sucesso !");
	}
}
