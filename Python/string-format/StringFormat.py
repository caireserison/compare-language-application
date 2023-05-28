doctor = 'Chamando Doutor Hans Chucrutes, chamando Doutor Hans Chucrutes'
police = 'se o Pica-Pau tivesse comunicado a polícia nada disso teria acontecido'
industry = 'Em todos esses anos nessa indústria vital, essa é a primeira vez que isso me acontece'
popcorn = 'Você falou pipoca?'
hotButtered = 'Quentinha e na manteiga?'
characters = 'Pica-Pau;Leôncio;Srta. Meany;Zeca Urubu;Picolino;Andy Panda'

# Quantidade de caracteres
print(len(industry))

# Contagem de ocorrências
print(doctor.count("Hans Chucrutes"))

# Concatenação
print(popcorn + hotButtered)

# Primeira letra maiúscula
print(police.capitalize())

# Substituição
sealion = police.replace('Pica-Pau', 'Leôncio')
print(sealion)

# Quebrar a string em lista
charactersList = characters.split(';')
print(charactersList)

# Juntar lista para string
returnCharacters = str.join(', ', charactersList)
print(returnCharacters)
