using Newtonsoft.Json;

class Movie
{
    public string Title { get; set; }
    public string ReleaseYear { get; set; }
    public string Director { get; set; }
    public string[] MainCast { get; set; }
}

class Program
{
    static void Main()
    {
        string inputJson = @"{
            ""title"": ""Titanic"",
            ""releaseYear"": 1998,
            ""director"": ""James Cameron"",
            ""mainCast"": 
            [
                ""Leonardo DiCaprio"", 
                ""Kate Winslet"",
                ""Billy Zane""
            ]
        }";

        // Convertendo JSON para objeto
        Movie movieObject = JsonConvert.DeserializeObject<Movie>(inputJson);
        Console.WriteLine($"=== Movie ===\n" + 
        $"Title: {movieObject.Title}\n" + 
        $"ReleaseYear: {movieObject.ReleaseYear}\n" + 
        $"Director: {movieObject.Director}\n" + 
        $"MainCast: {string.Join(", ", movieObject.MainCast)}");

        // Convertendo objeto para JSON
        string movieJson = JsonConvert.SerializeObject(movieObject);
        Console.WriteLine(movieJson);
    }
}