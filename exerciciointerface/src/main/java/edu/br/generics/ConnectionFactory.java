package edu.br.generics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // Altere "seu_banco", "root" e a senha de acordo com o seu MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco";
    private static final String USER = "root";
    private static final String PASS = "suasenha";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados!", e);
        }
    }
}