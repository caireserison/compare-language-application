var itens = new List<String>{"Casco Verde", "Casco Vermelho", "Raio", "Casca de Banana", "Estrela", "Cogumelo", "Casco Azul"};
var position = 8;

// for
for (int lap = 1; lap <= 3; lap++)
{
    Console.WriteLine(lap + "ª volta");
}

// foreach
foreach (var item in itens)
{
    Console.WriteLine("Você pegou " + item);
}

// while
while (position > 1)
{
    position--;
    Console.WriteLine("Você ultrapassou 1 kart. Você está na " + position + "ª posição.");
}

// do while
do
{
    position++;
    Console.WriteLine("Você foi atingido. Perdeu uma posição. você está na " + position + "ª posição.");
} while (position < 8);

if (position == 8) 
{
    Console.WriteLine("Você foi o último na corrida.");
}
