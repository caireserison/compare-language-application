var joeyApartment = 19;
var monicaApartment = 20;
var neighborApartment = 21;
var phoebeSong = "Smelly Cat";
var friends = new List<String>{"Ross", "Joey", "Chandler", "Rachel", "Monica"};

if (monicaApartment == 20 && (monicaApartment > joeyApartment || monicaApartment < neighborApartment))
{
    Console.WriteLine("O número do apartamento da Monica é igual a 20, é maior que o número do Joey e menor que o vizinho ao lado.");
}

if (!(neighborApartment == 21))
{
    Console.WriteLine("O apartamento do vizinho é diferente de 21.");
}
else if (joeyApartment != 19) 
{
    Console.WriteLine("O apartamento do Joey é diferente de 19.");
}
else 
{
    Console.WriteLine("OH. MEU. DEUS.");
}

if (phoebeSong.Equals("Smelly Cat")) 
{
    Console.WriteLine("What are they feeding you?");
}

if (friends.Contains("Chandler")) 
{
    var chandlerIndex = friends.IndexOf("Chandler");
    Console.WriteLine("Oi, Eu sou o " + friends[chandlerIndex] + ". Eu faço piadas quando estou desconfortável.");
}
