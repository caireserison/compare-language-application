using Microsoft.AspNetCore.Mvc;

namespace rest_service.Controllers;

[ApiController]
[Route("geek")]
public class GamesController : ControllerBase
{
    private readonly ILogger<GamesController> _logger;

    public GamesController(ILogger<GamesController> logger)
    {
        _logger = logger;
    }

    [HttpGet("games")]
    public IActionResult GetAll()
    {
        _logger.LogInformation("Buscando lista de vídeo games.");
        return Ok(AllGames.listGames);
    }

    [HttpGet("games/owner/{owner}")]
    public IActionResult GetGame(string owner)
    {
        _logger.LogInformation("Buscando vídeo games do mesmo proprietário.");
        var games = AllGames.listGames.Where(x => x.Owner == owner).ToList();
        if (games == null) {
            return NotFound("Vídeo game não encontrado na lista para esse proripetário.");
        } else {
            return Ok(games);
        }
    }

    [HttpPost("games")]
    public IActionResult PostGame(Games games)
    {
        _logger.LogInformation("Acrescentando um vídeo game.");
        AllGames.listGames.Add(games);
        return Created("/", AllGames.listGames);
    }

    [HttpDelete("games/{name}")]
    public IActionResult DeleteGame(string name)
    {
        _logger.LogInformation("Removendo um vídeo game.");
        var game = AllGames.listGames.FirstOrDefault(x => x.Name == name);
        if (game == null) {
            return NotFound("Vídeo game não encontrado na lista com esse nome.");
        } else {
            AllGames.listGames.Remove(game);
            return Ok(AllGames.listGames);
        }
    }
}
