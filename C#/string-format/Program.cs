var doctor = "Chamando Doutor Hans Chucrutes, chamando Doutor Hans Chucrutes";
var police = "se o Pica-Pau tivesse comunicado a polícia nada disso teria acontecido";
var industry = "Em todos esses anos nessa indústria vital, essa é a primeira vez que isso me acontece";
var popcorn = "Você falou pipoca?";
var hotButtered = "Quentinha e na manteiga?";
var characters = "Pica-Pau;Leôncio;Srta. Meany;Zeca Urubu;Picolino;Andy Panda";

// Quantidade de caracteres
Console.WriteLine(industry.Length);

// Contagem de ocorrências
var count = doctor.Split("Hans Chucrutes").Length - 1;
Console.WriteLine(count);

// Concatenação
Console.WriteLine(popcorn + hotButtered);

// Primeira letra maiúscula
Console.WriteLine(char.ToUpper(police[0]) + police.Substring(1));

// Substituição
var sealion = police.Replace("Pica-Pau", "Leôncio");
Console.WriteLine(sealion);

// Quebrar a string em lista (join em seguida pois lista não aparece no log)
var charactersList = characters.Split(';');
Console.WriteLine("[" + string.Join(", ", charactersList) + "]");

// Juntar lista para string
var returnCharacters = string.Join(", ", charactersList);
Console.WriteLine(returnCharacters);
