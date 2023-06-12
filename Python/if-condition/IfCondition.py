joeyApartment = 19
monicaApartment = 20
neighborApartment = 21
phoebeSong = 'Smelly Cat'
friends = ['Ross', 'Joey', 'Chandler', 'Rachel', 'Monica']

if monicaApartment == 20 and (monicaApartment > joeyApartment or monicaApartment < neighborApartment):
    print('O número do apartamento da Monica é igual a 20, é maior que o número do Joey e menor que o vizinho ao lado.')

if not neighborApartment == 21:
    print('O apartamento do vizinho é diferente de 21.')
elif joeyApartment != 19:
    print('O apartamento do Joey é diferente de 19.')
else:
    print('OH. MEU. DEUS.')

if phoebeSong == 'Smelly Cat':
    print('What are they feeding you?')

if 'Chandler' in friends:
    index = friends.index('Chandler')
    print('Oi, Eu sou o ' + friends[index] + '. Eu faço piadas quando estou desconfortável.')
