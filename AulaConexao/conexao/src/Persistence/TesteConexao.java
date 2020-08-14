package Persistence;

import java.sql.Connection;

public class TesteConexao {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Connection connection = new ConnectionFactory().getConnection();
    }
}