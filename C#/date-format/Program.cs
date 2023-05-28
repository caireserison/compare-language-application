// Data e hora atuais com formatação padrão
DateTime now = DateTime.Now;
Console.WriteLine(now);

// Formatando para aaaa-MM-dd (padrão diferente do retornado acima)
string formatDate = now.ToString("yyyy-MM-dd");
Console.WriteLine(formatDate);
