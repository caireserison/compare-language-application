using System.Dynamic;
using System.Globalization;
using CsvHelper;
using CsvHelper.Configuration;
using Npgsql;

Console.WriteLine("Início da aplicação: " + DateTime.Now.ToString("HH:mm:ss.fff"));

var connectionString = "Host=localhost;Port=5432;User Id=postgres;Password=locaires;Database=postgres";
Console.WriteLine("Lendo arquivo csv");
using (var reader = new StreamReader("../../_files/file-to-database/songs_short.csv")) 
{
    Console.WriteLine("Conexão com banco de dados PostgreSQL");
    using (var connection = new NpgsqlConnection(connectionString))
    {
        connection.Open();
        var csvConfig = new CsvConfiguration(CultureInfo.InvariantCulture);
        using (var csv = new CsvReader(reader, csvConfig))
        {
            Console.WriteLine("Percorrendo arquivo csv");
            var records = csv.GetRecords<dynamic>().ToList();
            foreach (ExpandoObject song in records)
            {
                // Verificando gênero
                if (song.First(x => x.Key == "genre").Value.ToString() == "Rock")
                {
                    // Inserindo linha na tabela
                    using (var command = new NpgsqlCommand("INSERT INTO rock_songs (name, artist, release_year) VALUES (@name, @artist, @release_year)", connection))
                    {
                        command.Parameters.AddWithValue("name", song.First(x => x.Key == "name").Value.ToString());
                        command.Parameters.AddWithValue("artist", song.First(x => x.Key == "artist").Value.ToString());
                        command.Parameters.AddWithValue("release_year", song.First(x => x.Key == "release_year").Value.ToString());
                        command.ExecuteNonQuery();
                    }
                }
            }
        }
        Console.WriteLine("Buscando a quantidade de linhas na tabela");
        var rowCount = 0;
        using (var command = new NpgsqlCommand($"SELECT COUNT(*) FROM rock_songs", connection))
        {
            rowCount = Convert.ToInt32(command.ExecuteScalar());
        }
        Console.WriteLine("A tabela possui " + rowCount.ToString() + " registro(s) de músicas do gênero Rock.");
    }
}

Console.WriteLine("Fim da aplicação: " + DateTime.Now.ToString("HH:mm:ss.fff"));
