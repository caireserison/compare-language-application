let pets = ['dog', 'cat', 'rabbit', 'dog', 'turtle', 'parrot', 'cat', 'lizard', 'snake']

// Lista criada e sua quantidade de itens
console.log(pets)
console.log('This list has ' + pets.length + ' pets.')

// Removendo registros duplicados
let petsWithoutDuplicates = pets.filter(function(index, i) {
    return pets.indexOf(index) === i;
});
console.log(petsWithoutDuplicates);

// Identificando e alterando item da lista
const indexChange = petsWithoutDuplicates.indexOf('parrot')
petsWithoutDuplicates[indexChange] = 'fish'
console.log(petsWithoutDuplicates)

// Removendo e adicionando item
const snakeIndex = petsWithoutDuplicates.indexOf('snake')
petsWithoutDuplicates.splice(snakeIndex, 1)
petsWithoutDuplicates.push('hamster')
console.log(petsWithoutDuplicates)

// Ordenando itens
petsWithoutDuplicates.sort()
console.log(petsWithoutDuplicates)

// Limpando a lista
petsWithoutDuplicates.splice(0, petsWithoutDuplicates.length)
console.log(petsWithoutDuplicates)
