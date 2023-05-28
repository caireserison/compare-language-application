var joeyApartment = 19;
var monicaApartment = 20;
var neighborApartment = 21;
var phoebeSong = "Smelly Cat";
var friends = new List<String>{"Ross", "Joey", "Chandler", "Rachel", "Monica"};

if (monicaApartment == 20 && (monicaApartment > joeyApartment || monicaApartment < neighborApartment))
{
    Console.WriteLine("Monica's apartment equals 20 and is greater than Joey apartment or less than other neighbor apartment.");
}

if (!(neighborApartment == 21))
{
    Console.WriteLine("Neighbor apartment is different from 21.");
}
else if (joeyApartment != 19) 
{
    Console.WriteLine("Joey's apartment is different from 19.");
}
else 
{
    Console.WriteLine("Oh. My. God.");
}

if (phoebeSong.Equals("Smelly Cat")) 
{
    Console.WriteLine("What are they feeding you?");
}

if (friends.Contains("Chandler")) 
{
    var chandlerIndex = friends.IndexOf("Chandler");
    Console.WriteLine("Hi, I'm " + friends[chandlerIndex] + ". I make jokes when I'm uncomfortable.");
}
