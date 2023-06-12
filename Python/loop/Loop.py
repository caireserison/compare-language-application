itens = ['Casco Verde', 'Casco Vermelho', 'Raio', 'Banana', 'Estrela', 'Cogumelo', 'Casco Azul']
position = 8

# for
for lap in range(1,4):
    print(str(lap) + 'ª volta')

# foreach
for item in itens:
    print('Você pegou ' + item)

# while
while position > 1:
    position -= 1
    print('Você ultrapassou 1 kart. Você está na ' + str(position) + 'ª posição.')

# do while (fake)
while True:
    position += 1
    print('Você foi atingido. Perdeu uma posição. você está na ' + str(position) + 'ª posição.')
    if not position < 8:
        break;

if position == 8:
    print('Você foi o último na corrida.')
