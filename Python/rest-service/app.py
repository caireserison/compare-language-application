from flask import Flask, request
from flask_restx import Resource, Api
from model.Games import Games, AllGames

AllGames.list_games.append(Games('Atari', 'Atari', '1983'))
AllGames.list_games.append(Games('NES', 'Nintendo', '1983'))
AllGames.list_games.append(Games('Master System', 'Sega', '1987'))
AllGames.list_games.append(Games('Game Boy', 'Nintendo', '1989'))
AllGames.list_games.append(Games('Mega Drive', 'Sega', '1988'))
AllGames.list_games.append(Games('Super Nintendo', 'Nintendo', '1990'))
AllGames.list_games.append(Games('Playstation', 'Sony', '1994'))
AllGames.list_games.append(Games('Nintendo 64', 'Nintendo', '1996'))

app = Flask(__name__)
api = Api(app)

@api.route('/geek/games')
class GeekGame(Resource):
    def get(self):
        print('Buscando lista de vídeo games.')
        games = [game.__dict__ for game in AllGames.list_games]
        return games, 200
    
    def post(self):
        print('Acrescentando um vídeo game.')
        game_dict = request.get_json()
        new_game = Games(game_dict['name'], game_dict['owner'], game_dict['releaseYear'])
        AllGames.list_games.append(new_game)
        games = [game.__dict__ for game in AllGames.list_games]
        return games, 201

@api.route('/geek/games/owner/<string:owner>')
class GeekGameOwner(Resource):
    def get(self, owner):
        print('Buscando vídeo games do mesmo proprietário.')
        game = [game.__dict__ for game in AllGames.list_games if game.owner == owner]
        if not game:
            return 'Vídeo game não encontrado na lista para esse proripetário.', 404
        return game, 200

@api.route('/geek/games/<string:name>')
class GeekGameName(Resource):
    def delete(self, name):
        print('Removendo um vídeo game.')
        game = next((game for game in AllGames.list_games if game.name == name), None)
        if not game:
            return 'Vídeo game não encontrado na lista com esse nome.', 404
        AllGames.list_games.remove(game)
        games = [game.__dict__ for game in AllGames.list_games]
        return games, 200

if __name__ == '__main__':
    app.run(port=5000,host='localhost',debug=True)
