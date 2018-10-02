package br.com.etematica;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection createConnection() throws SQLException {
        String url = "jdbc:jtds:sybase://localhost:5000/dtb_eqt"; //Nome da base de dados
        String user = "nicolau"; //nome do usuário do MySQL
        String password = "nicolau"; //senha do MySQL

        Connection conexao = null;
        conexao = DriverManager.getConnection(url, user, password);

        return conexao;
    }
}