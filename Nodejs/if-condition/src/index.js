const joeyApartment = 19
const monicaApartment = 20
const neighborApartment = 21
const phoebeSong = 'Smelly Cat'
const friends = ['Ross', 'Joey', 'Chandler', 'Rachel', 'Monica']

if (monicaApartment === 20 && (monicaApartment > joeyApartment || monicaApartment < neighborApartment)) {
  console.log('O número do apartamento da Monica é igual a 20, é maior que o número do Joey e menor que o vizinho ao lado.')
}

if (!(neighborApartment === 21)) {
  console.log('O apartamento do vizinho é diferente de 21.')
}
else if (joeyApartment != 19) {
  console.log('O apartamento do Joey é diferente de 19.')
}
else {
  console.log('OH. MEU. DEUS.')
}

if (phoebeSong === 'Smelly Cat') {
  console.log('What are they feeding you?')
}

if (friends.includes('Chandler')) {
  let chandlerIndex = friends.findIndex(item => item === 'Chandler');
  console.log('Oi, Eu sou o ' + friends[chandlerIndex] + '. Eu faço piadas quando estou desconfortável.')
}
