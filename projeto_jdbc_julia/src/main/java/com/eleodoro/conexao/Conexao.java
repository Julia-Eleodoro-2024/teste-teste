package com.eleodoro.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static String url = "jdbc:mysql://localhost:3306/loja";
    private static String user = "root";
    private static String password = "";

    private static Connection conn;

    public static Connection getConexao() {

        try {

            if (conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Conexão com o banco de dados criada com sucesso.");
                return conn;
            } else {
                System.out.println("Conexão com o banco de dados estável.");
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro na conexão com o banco de dados.");
            return null;
        }

    } 
    
}