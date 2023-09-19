inputJson = 
`{
    "title": "Titanic",
    "releaseYear": 1998,
    "director": "James Cameron",
    "mainCast": 
    [
        "Leonardo DiCaprio", 
        "Kate Winslet", 
        "Billy Zane"
    ]
}`

class Movie {
    constructor(title, releaseYear, director, mainCast) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = director;
        this.mainCast = mainCast;
    }
}

// Convertendo String para Json
const parsedData = JSON.parse(data);

// Convertendo json para objeto
const movieObject = new Movie(parsedData.title, parsedData.releaseYear, parsedData.director, parsedData.mainCast);
console.log(movieObject);

// Convertendo objeto para json
const movieJson = JSON.stringify(movieObject);
console.log(movieJson);
