package com.file_to_database;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        System.out.println("Início da aplicação: " + new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));

        System.out.println("Lendo arquivo CSV");
        var path = Paths.get(".").toAbsolutePath().getParent().getParent().getParent();
        var filePath = Paths.get(path.toAbsolutePath() + "\\_files\\file-to-database\\songs.csv").toAbsolutePath().toString();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        System.out.println("Conexão com banco de dados PostgreSQL");
        String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";
        String jdbcUsername = "postgres";
        String jdbcPassword = "locaires";
        Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        Statement stmt = conn.createStatement();

        System.out.println("Percorrendo arquivo csv");
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            List<String> columns = Arrays.asList(data);
            // Verificando gênero
            String genre = data[0].trim();
            if (genre.equals("Rock")) {
                // Inserindo linha na tabela
                String name = data[1];
                String artist = data[2];
                String releaseYear = data[3];
                String insertCommand = "INSERT INTO rock_songs (name, artist, release_year) VALUES (?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(insertCommand);
                pstmt.setString(1, name);
                pstmt.setString(2, artist);
                pstmt.setString(3, releaseYear);
                pstmt.executeUpdate();
            }
        }

        System.out.println("Buscando a quantidade de linhas na tabela");
        String countQuery = "SELECT COUNT(*) FROM rock_songs";
        ResultSet result = stmt.executeQuery(countQuery);
        if (((ResultSet) result).next()) {
            int rowCount = result.getInt(1);
            System.out.println("A tabela possui " + rowCount + " registro(s) de músicas do gênero Rock.");
        }

        // Fechando conexão com banco de dados
        stmt.close();
        conn.close();
        reader.close();

        System.out.println("Fim da aplicação: " + new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));
    }
}