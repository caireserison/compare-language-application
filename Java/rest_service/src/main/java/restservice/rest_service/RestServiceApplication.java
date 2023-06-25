package restservice.rest_service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import restservice.rest_service.models.AllGames;
import restservice.rest_service.models.Games;

import java.util.ArrayList;

@SpringBootApplication
@OpenAPIDefinition
public class RestServiceApplication {

	public static void main(String[] args) {

		// Lista default
		AllGames.listGames.add(new Games("Atari", "Atari", "1983"));
		AllGames.listGames.add(new Games("NES", "Nintendo", "1983"));
		AllGames.listGames.add(new Games("Master System", "Sega", "1987"));
		AllGames.listGames.add(new Games("Game Boy", "Nintendo", "1989"));
		AllGames.listGames.add(new Games("Mega Drive", "Sega", "1988"));
		AllGames.listGames.add(new Games("Super Nintendo", "Nintendo", "1990"));
		AllGames.listGames.add(new Games("Playstation", "Sony", "1994"));
		AllGames.listGames.add(new Games("Nintendo 64", "Nintendo", "1996"));

		SpringApplication.run(RestServiceApplication.class, args);
	}

}
