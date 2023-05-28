var itens = new List<String>{"Green Shell", "Red Shell", "Lightning", "Banana", "Starman", "Mushroom", "Spiny Shell"};
var position = 8;

// for
for (int lap = 1; lap <= 3; lap++)
{
    Console.WriteLine(lap + " lap");
}

// foreach
foreach (var item in itens)
{
    Console.WriteLine("You got a " + item);
}

// while
while (position > 1)
{
    position--;
    Console.WriteLine("Overtook 1 kart. You're in position " + position);
}

// do while
do
{
    position++;
    Console.WriteLine("You've been hit. Lost one position. You are in position " + position);
} while (position < 8);

if (position == 8) 
{
    Console.WriteLine("You were last in the race.");
}
