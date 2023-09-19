import json

inputJson = """
{
    "title": "Titanic",
    "releaseYear": 1998,
    "director": "James Cameron",
    "mainCast": 
    [
        "Leonardo DiCaprio", 
        "Kate Winslet", 
        "Billy Zane"
    ]
}
"""

class Movie:
    def __init__(self, title, releaseYear, director, mainCast):
        self.title = title
        self.releaseYear = releaseYear
        self.director = director
        self.mainCast = mainCast

parsed_data = json.loads(inputJson)

movie_object = Movie(parsed_data['title'], parsed_data['releaseYear'], parsed_data['director'], parsed_data['mainCast'])
print(vars(movie_object))

movie_json = json.dumps(movie_object.__dict__)
print(movie_json)
