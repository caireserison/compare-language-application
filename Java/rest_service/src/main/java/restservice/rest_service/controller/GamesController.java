package restservice.rest_service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import restservice.rest_service.models.AllGames;
import restservice.rest_service.models.Games;

import java.util.List;

@RestController
@RequestMapping("/geek")
public class GamesController {
    private static final Logger logger = LoggerFactory.getLogger(GamesController.class);

    @GetMapping("/games")
    public ResponseEntity<List<Games>> getAll() {
        logger.info("Buscando lista de vídeo games.");
        return ResponseEntity.ok(AllGames.listGames);
    }

    @GetMapping("/games/owner/{owner}")
    public ResponseEntity<List<Games>> getGame(@PathVariable String owner) {
        logger.info("Buscando vídeo games do mesmo proprietário.");
        var games = AllGames.listGames.stream()
                .filter(x -> x.getOwner().equals(owner))
                .toList();

        if (games.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vídeo game não encontrado na lista para esse proprietário.");
        } else {
            return ResponseEntity.ok(games);
        }
    }

    @PostMapping("/games")
    public ResponseEntity<List<Games>> postGame(@RequestBody Games game) {
        logger.info("Acrescentando um vídeo game.");
        AllGames.listGames.add(game);
        return ResponseEntity.ok(AllGames.listGames);
    }

    @DeleteMapping("/games/{name}")
    public ResponseEntity<List<Games>> postGame(@PathVariable String name) {
        logger.info("Removendo um vídeo game.");
        var game = AllGames.listGames.stream()
                .filter(x -> x.getName().equals(name))
                .findFirst();
        if (game.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vídeo game não encontrado na lista com esse nome.");
        } else {
            AllGames.listGames.remove(game.get());
            return ResponseEntity.ok(AllGames.listGames);
        }
    }
}
