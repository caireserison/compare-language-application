const itens = ['Casco Verde', 'Casco Vermelho', 'Raio', 'Banana', 'Estrela', 'Cogumelo', 'Casco Azul']
let position = 8

// for
for (let lap = 1; lap <= 3; lap++) {
    console.log(lap + 'ª volta')
}

// foreach
itens.forEach(item => {
    console.log('Você pegou ' + item)
});

// while
while (position > 1) {
    position--
    console.log('Você ultrapassou 1 kart. Você está na ' + position + 'ª posição.')
}

// do while
do {
    position++
    console.log('Você foi atingido. Perdeu uma posição. você está na ' + position + 'ª posição.')
} while (position < 8);

if (position === 8) {
    console.log('Você foi o último na corrida.')
}
