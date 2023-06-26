## Instalar Nodejs:
https://nodejs.org/en/download

## Criando aplicação:
` npx express-generator `

## Execução:
` npm install `
` npm start `

## Exemplos de requisição:
Swagger: http://localhost:3000/api-docs/
```
curl -X 'GET' \
  'https://localhost:3000/geek/games' \
  -H 'accept: */*'
```

```
curl -X 'GET' \
  'https://localhost:3000/geek/games/owner/Nintendo' \
  -H 'accept: */*'
```

```
curl -X 'POST' \
  'https://localhost:3000/geek/games' \
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
  'https://localhost:3000/geek/games/Game%20Boy' \
  -H 'accept: */*'
```
