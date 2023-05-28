pets = ['dog', 'cat', 'rabbit', 'dog', 'turtle', 'parrot', 'cat', 'lizard', 'snake']

# Lista criada e sua quantidade de itens
print(pets)
print('This list has ' + str(len(pets)) + ' pets.')

# Removendo registros duplicados
petsWithoutDuplicates = list(set(pets))
print(petsWithoutDuplicates)

# Identificando e alterando item da lista
indexChange = petsWithoutDuplicates.index('parrot')
petsWithoutDuplicates[indexChange] = 'fish'
print(petsWithoutDuplicates)

# Removendo e adicionando item
petsWithoutDuplicates.remove('snake')
petsWithoutDuplicates.append('hamster')
print(petsWithoutDuplicates)

# Ordenando itens
petsWithoutDuplicates.sort()
print(petsWithoutDuplicates)

# Limpando a lista
petsWithoutDuplicates.clear()
print(petsWithoutDuplicates)
