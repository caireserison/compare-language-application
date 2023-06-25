## Instalando Java:
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

## Instalando Maven:
` choco install maven `

## Criando aplicação:
https://start.spring.io/

## Exemplos de requisição:
Swagger: http://localhost:8080/swagger-ui/index.html#/
```
curl -X 'GET' \
  'https://localhost:8080/geek/games' \
  -H 'accept: */*'
```

```
curl -X 'GET' \
  'https://localhost:8080/geek/games/owner/Nintendo' \
  -H 'accept: */*'
```

```
curl -X 'POST' \
  'https://localhost:8080/geek/games' \
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
  'https://localhost:8080/geek/games/Game%20Boy' \
  -H 'accept: */*'
```
