###### Instalar Python:
https://www.python.org/downloads/

## Criando aplicação (dependência):
` pip install flask `

###### Execução:
` python app.py `

## Exemplos de requisição:
Swagger: http://localhost:5000/
```
curl -X 'GET' \
  'https://localhost:5000/geek/games' \
  -H 'accept: */*'
```

```
curl -X 'GET' \
  'https://localhost:5000/geek/games/owner/Nintendo' \
  -H 'accept: */*'
```

```
curl -X 'POST' \
  'https://localhost:5000/geek/games' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "name": "Xbox",
  "owner": "Microsoft",
  "releaseYear": "2001"
}'
```

```
curl -X 'DELETE' \
  'https://localhost:5000/geek/games/Game%20Boy' \
  -H 'accept: */*'
```
