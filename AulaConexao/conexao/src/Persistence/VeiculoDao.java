package Persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Veiculo;

public class VeiculoDao {
    private Connection connection;

    public VeiculoDao(){
        connection = new ConnectionFactory().getConnection();
    }

    
    /** 
     * @param veiculo
     */
    public void adicionar(Veiculo veiculo){
        String sql = "insert into veiculo values(null,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, veiculo.getMarca());
            stmt.setString(2, veiculo.getModelo());
            stmt.execute();
            stmt.close();
            connection.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    
    /** 
     * @return List<Veiculo>
     */
    public List<Veiculo> listar() {
		String sql = "select * from veiculo";
		List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
                Veiculo veiculo = new Veiculo(rs.getInt("codigo"), rs.getString("marca"), rs.getString("modelo"));
                listaVeiculos.add(veiculo);            
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listaVeiculos;
	}

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        //Veiculo veiculo = new Veiculo(1 ,"Citroen", "C3");
        VeiculoDao veiculoDao = new VeiculoDao();
        //veiculoDao.adicionar(veiculo);
        System.out.println(veiculoDao.listar());
    }
    
}