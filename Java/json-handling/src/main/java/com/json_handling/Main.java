package com.json_handling;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Movie {
    private String title;
    private int releaseYear;
    private String director;
    private String[] mainCast;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getMainCast() {
        return mainCast;
    }

    public void setMainCast(String[] mainCast) {
        this.mainCast = mainCast;
    }
}

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String inputJson =
                "{\n" +
                "  \"title\": \"Titanic\",\n" +
                "  \"releaseYear\": 1998,\n" +
                "  \"director\": \"James Cameron\",\n" +
                "  \"mainCast\": \n " +
                "  [\n" +
                "   \"Leonardo DiCaprio\", \n" +
                "   \"Kate Winslet\", \n" +
                "   \"Billy Zane\" \n" +
                "   ]\n" +
                "}";

        // Convertendo JSON para objeto
        var objectMapper = new ObjectMapper();
        var movieObject = objectMapper.readValue(inputJson, Movie.class);
        System.out.printf("=== Movie ===%nTitle: %s%nReleaseYear: %d%nDirector: %s%nMainCast: %s%n",
                movieObject.getTitle(),
                movieObject.getReleaseYear(),
                movieObject.getDirector(),
                String.join(", ", movieObject.getMainCast()));

        // Convertendo objeto para JSON
        String movieJson = objectMapper.writeValueAsString(movieObject);
        System.out.println(movieJson);
    }
}