const joeyApartment = 19
const monicaApartment = 20
const neighborApartment = 21
const phoebeSong = 'Smelly Cat'
const friends = ['Ross', 'Joey', 'Chandler', 'Rachel', 'Monica']

if (monicaApartment === 20 && (monicaApartment > joeyApartment || monicaApartment < neighborApartment)) {
  console.log('Monica\'s apartment equals 20 and is greater than Joey apartment or less than other neighbor apartment.')
}

if (!(neighborApartment === 21)) {
  console.log('Neighbor apartment is different from 21.')
}
else if (joeyApartment != 19) {
  console.log('Joey\'s apartment is different from 19.')
}
else {
  console.log('Oh. My. God.')
}

if (phoebeSong === 'Smelly Cat') {
  console.log('What are they feeding you?')
}

if (friends.includes('Chandler')) {
  let chandlerIndex = friends.findIndex(item => item === 'Chandler');
  console.log('Hi, I\'m ' + friends[chandlerIndex] + '. I make jokes when I\'m uncomfortable.')
}
