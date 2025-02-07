async function getFilms() {
    // Requisição GET
    const response = await fetch("https://swapi.dev/api/films");
    if (!response.ok) 
        throw new Error(`Erro na requisição: Código  ${response.status}`);

    // Tratamento de JSON
    const data = await response.json();

    // Gerando lista de filmes
    console.log("Lista de filmes Star Wars:");
    data.results.forEach(film => console.log(film.title));
}
getFilms();
