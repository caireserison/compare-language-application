## Instalar dotnet:
https://dotnet.microsoft.com/en-us/download

## Criando aplicação:
` dotnet new webapi -n "rest-service" `

## Execução:
` dotnet run `

## Exemplos de requisição:
Swagger: https://localhost:7017/swagger/index.html
```
curl -X 'GET' \
  'https://localhost:7017/geek/games' \
  -H 'accept: */*'
```

```
curl -X 'GET' \
  'https://localhost:7017/geek/games/owner/Nintendo' \
  -H 'accept: */*'
```

```
curl -X 'POST' \
  'https://localhost:7017/geek/games' \
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
  'https://localhost:7017/geek/games/Game%20Boy' \
  -H 'accept: */*'
```
