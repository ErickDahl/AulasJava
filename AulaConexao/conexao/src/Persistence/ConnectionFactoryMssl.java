package Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryMssl {
    String urlConexao = "jdbc:sqlserver://[localhost][Trabalho][:1433]]";
    String usuario = "root";
    String senha = "Verm@124";
    Connection connection;

    
    /** 
     * @return Connection
     */
    public Connection getConnection() {
        System.out.println("Tentando conectar ao banco");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(urlConexao, usuario, senha);
            if(connection != null){
                System.out.println("Conectado com sucesso");
            } else{
                System.out.println("Não possível conectar");
            }
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado ou problema no path");
            return null;
        } catch (SQLException e) {
            System.out.println("Erro de sql exception");
            return null;
        }
    }
}