var pets = new List<String>{"dog", "cat", "rabbit", "dog", "turtle", "parrot", "cat", "lizard", "snake"};

// Lista criada e sua quantidade de itens
Console.WriteLine(string.Join(", ", pets));
Console.WriteLine("This list has " + pets.Count + " pets.");

// Removendo registros duplicados
var petsWithoutDuplicates = pets.Distinct().ToList();
Console.WriteLine(string.Join(", ", petsWithoutDuplicates));

// Identificando e alterando item da lista
var indexChange = petsWithoutDuplicates.IndexOf("parrot");
petsWithoutDuplicates[indexChange] = "fish";
Console.WriteLine(string.Join(", ", petsWithoutDuplicates));

// Removendo e adicionando item
petsWithoutDuplicates.Remove("snake");
petsWithoutDuplicates.Add("hamster");
Console.WriteLine(string.Join(", ", petsWithoutDuplicates));

// Ordenando itens (o .Net está com a lista ordenada mesmo antes desta instrução)
petsWithoutDuplicates.Order();
Console.WriteLine(string.Join(", ", petsWithoutDuplicates));

// Limpando a lista
petsWithoutDuplicates.Clear();
Console.WriteLine(string.Join(", ", petsWithoutDuplicates));
