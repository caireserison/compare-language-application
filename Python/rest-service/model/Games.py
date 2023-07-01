class Games:
    def __init__(self, name, owner, release_year):
        self.name = name
        self.owner = owner
        self.release_year = release_year
        
    def __str__(self):
        return "Name: " + self.name + "; Owner: " + self.owner + "; ReleaseYear: " + self.release_year + ";"


class AllGames:
    list_games = []
