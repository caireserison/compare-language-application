const itens = ['Green Shell', 'Red Shell', 'Lightning', 'Banana', 'Starman', 'Mushroom', 'Spiny Shell']
let position = 8

// for
for (let lap = 1; lap <= 3; lap++) {
    console.log(lap + ' lap')
}

// foreach
itens.forEach(item => {
    console.log('You got a ' + item)
});

// while
while (position > 1) {
    position--
    console.log('Overtook 1 kart. You\'re in position ' + position)
}

// do while
do {
    position++
    console.log('You\'ve been hit. Lost one position. You are in position ' + position)
} while (position < 8);

if (position === 8) {
    console.log('You were last in the race.')
}
