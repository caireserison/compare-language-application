using MySql.Data.MySqlClient;

class Program
{
    static void Main(string[] args)
    {
        // Configuração da conexão com o banco de dados
        // ALTERAR PARA:
        // "server=localhost;user=test;password=test;database=db_test";
        using (var connection = new MySqlConnection("server=localhost;user=principal;password=usual.00;database=mysql"))
        {
            // Abre a conexão com o banco de dados
            connection.Open();

            // Seleciona a tabela
            var sql = "SELECT * FROM artists";
            using (var command = new MySqlCommand(sql, connection))
            {
                using (var reader = command.ExecuteReader())
                {
                    Console.WriteLine("As seguintes músicas foram encontradas:");
                    while (reader.Read())
                    {
                        Console.WriteLine("{0}\t{1}\t{2}", reader.GetString(0), reader.GetString(1), reader.GetString(2));
                    }
                }
            }

            // Fecha a conexão com o banco de dados
            connection.Close();
        }
    }
}
