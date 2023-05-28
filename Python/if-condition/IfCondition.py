joeyApartment = 19
monicaApartment = 20
neighborApartment = 21
phoebeSong = 'Smelly Cat'
friends = ['Ross', 'Joey', 'Chandler', 'Rachel', 'Monica']

if monicaApartment == 20 and (monicaApartment > joeyApartment or monicaApartment < neighborApartment):
    print('Monica\'s apartment equals 20 and is greater than Joey apartment or less than other neighbor apartment.')

if not neighborApartment == 21:
    print('Neighbor apartment is different from 21.')
elif joeyApartment != 19:
    print('Joey\'s apartment is different from 19.')
else:
    print('Oh. My. God.')

if phoebeSong == 'Smelly Cat':
    print('What are they feeding you?')

if 'Chandler' in friends:
    index = friends.index('Chandler')
    print('Hi, I\'m ' + friends[index] + '. I make jokes when I\'m uncomfortable.')
