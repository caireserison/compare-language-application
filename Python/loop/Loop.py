itens = ['Green Shell', 'Red Shell', 'Lightning', 'Banana', 'Starman', 'Mushroom', 'Spiny Shell']
position = 8

# for
for lap in range(1,4):
    print(str(lap) + ' lap')

# foreach
for item in itens:
    print('You got a ' + item)

# while
while position > 1:
    position -= 1
    print('Overtook 1 kart. You\'re in position ' + str(position))

# do while (fake)
while True:
    position += 1
    print('You\'ve been hit. Lost 1 position. You\'re in position ' + str(position))
    if not position < 7:
        break;

if position == 8:
    print('You were last in the race.')
