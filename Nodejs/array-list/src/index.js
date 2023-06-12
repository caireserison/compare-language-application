let pets = ['cachorro', 'gato', 'coelho', 'cachorro', 'tartaruga', 'papagaio', 'gato', 'lagarto', 'cobra']

// Lista criada e sua quantidade de itens
console.log(pets)
console.log('Essa lista possui ' + pets.length + ' animais.')

// Removendo registros duplicados
let petsWithoutDuplicates = pets.filter(function(index, i) {
    return pets.indexOf(index) === i;
});
console.log(petsWithoutDuplicates);

// Identificando e alterando item da lista
const indexChange = petsWithoutDuplicates.indexOf('papagaio')
petsWithoutDuplicates[indexChange] = 'peixe'
console.log(petsWithoutDuplicates)

// Removendo e adicionando item
const snakeIndex = petsWithoutDuplicates.indexOf('cobra')
petsWithoutDuplicates.splice(snakeIndex, 1)
petsWithoutDuplicates.push('hamster')
console.log(petsWithoutDuplicates)

// Ordenando itens
petsWithoutDuplicates.sort()
console.log(petsWithoutDuplicates)

// Limpando a lista
petsWithoutDuplicates.splice(0, petsWithoutDuplicates.length)
console.log(petsWithoutDuplicates)
