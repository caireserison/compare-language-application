using System.Text.Json;

// Requisição GET
using HttpClient client = new HttpClient();
HttpResponseMessage response = await client.GetAsync("https://swapi.dev/api/films");
response.EnsureSuccessStatusCode();

// Tratamento de JSON
string json = await response.Content.ReadAsStringAsync();
using JsonDocument doc = JsonDocument.Parse(json);
JsonElement root = doc.RootElement;
JsonElement results = root.GetProperty("results");

// Gerando lista de filmes
Console.WriteLine("Lista de filmes Star Wars:");
foreach (JsonElement film in results.EnumerateArray())
{
    Console.WriteLine(film.GetProperty("title").GetString());
}
