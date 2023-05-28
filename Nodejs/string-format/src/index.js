let doctor = 'Chamando Doutor Hans Chucrutes, chamando Doutor Hans Chucrutes';
let police = 'se o Pica-Pau tivesse comunicado a polícia nada disso teria acontecido';
let industry = 'Em todos esses anos nessa indústria vital, essa é a primeira vez que isso me acontece';
let popcorn = 'Você falou pipoca?';
let hotButtered = 'Quentinha e na manteiga?';
let characters = 'Pica-Pau;Leôncio;Srta. Meany;Zeca Urubu;Picolino;Andy Panda';

// Quantidade de caracteres
console.log(industry.length);

// Contagem de ocorrências
console.log(doctor.match(/Hans Chucrutes/g).length);

// Concatenação
console.log(popcorn + hotButtered);

// Primeira letra maiúscula
console.log(police.charAt(0).toUpperCase() + police.slice(1));

// Substituição
let sealion = police.replace('Pica-Pau', 'Leôncio');
console.log(sealion);

// Quebrar a string em lista
let charactersList = characters.split(';');
console.log(charactersList);

// Juntar lista para string
let returnCharacters = charactersList.join(', ');
console.log(returnCharacters);
