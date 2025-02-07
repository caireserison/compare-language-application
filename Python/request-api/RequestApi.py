import requests

# Requisição GET
response = requests.get("https://swapi.dev/api/films")
response.raise_for_status()

# Tratamento de JSON
data = response.json()

# Gerando lista de filmes
print("Lista de filmes Star Wars:")
for film in data["results"]:
    print(film["title"])

