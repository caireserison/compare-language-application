package com.connect_to_mysql;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // Configuração da conexão com o banco de dados
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "principal", "usual.00")) {
        // ALTERAR PARA:
        //try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test", "test", "test")) {
            // Seleciona a tabela
            String sql = "SELECT * FROM artists";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {
                System.out.println("As seguintes músicas foram encontradas:");
                while (resultSet.next()) {
                    System.out.printf("%s\t%s\t%s\t%s%n",
                            resultSet.getString("id"),
                            resultSet.getString("name"),
                            resultSet.getString("genre"),
                            resultSet.getString("start_year")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
