var pets = new List<String>{"cachorro", "gato", "coelho", "cachorro", "tartaruga", "papagaio", "gato", "lagarto", "cobra"};

// Lista criada e sua quantidade de itens
Console.WriteLine(string.Join(", ", pets));
Console.WriteLine("Essa lista possui " + pets.Count + " animais.");

// Removendo registros duplicados
var petsWithoutDuplicates = pets.Distinct().ToList();
Console.WriteLine(string.Join(", ", petsWithoutDuplicates));

// Identificando e alterando item da lista
var indexChange = petsWithoutDuplicates.IndexOf("papagaio");
petsWithoutDuplicates[indexChange] = "peixe";
Console.WriteLine(string.Join(", ", petsWithoutDuplicates));

// Removendo e adicionando item
petsWithoutDuplicates.Remove("cobra");
petsWithoutDuplicates.Add("hamster");
Console.WriteLine(string.Join(", ", petsWithoutDuplicates));

// Ordenando itens (o .Net está com a lista ordenada mesmo antes desta instrução)
petsWithoutDuplicates.Order();
Console.WriteLine(string.Join(", ", petsWithoutDuplicates));

// Limpando a lista
petsWithoutDuplicates.Clear();
Console.WriteLine(string.Join(", ", petsWithoutDuplicates));
