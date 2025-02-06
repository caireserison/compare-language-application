package com.request_api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Requisição GET
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://swapi.dev/api/films"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200)
            System.out.println("Erro na requisição: Código " + response.statusCode());

        // Tratamento de JSON
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(response.body());

        // Gerando lista de filmes
        System.out.println("Lista de filmes Star Wars:");
        for (JsonNode film : rootNode.get("results")) {
            System.out.println(film.get("title").asText());
        }
    }
}