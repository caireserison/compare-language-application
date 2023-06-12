pets = ['cachorro', 'gato', 'coelho', 'cachorro', 'tartaruga', 'papagaio', 'gato', 'lagarto', 'cobra']

# Lista criada e sua quantidade de itens
print(pets)
print('Essa lista tem ' + str(len(pets)) + ' animais.')

# Removendo registros duplicados
petsWithoutDuplicates = list(set(pets))
print(petsWithoutDuplicates)

# Identificando e alterando item da lista
indexChange = petsWithoutDuplicates.index('papagaio')
petsWithoutDuplicates[indexChange] = 'peixe'
print(petsWithoutDuplicates)

# Removendo e adicionando item
petsWithoutDuplicates.remove('cobra')
petsWithoutDuplicates.append('hamster')
print(petsWithoutDuplicates)

# Ordenando itens
petsWithoutDuplicates.sort()
print(petsWithoutDuplicates)

# Limpando a lista
petsWithoutDuplicates.clear()
print(petsWithoutDuplicates)
