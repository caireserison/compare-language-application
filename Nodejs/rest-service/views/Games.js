class Games {
    constructor(name, owner, releaseYear) {
        this.name = name;
        this.owner = owner;
        this.releaseYear = releaseYear;
    }
}

class AllGames {
    listGames = []
}

module.exports = { Games, AllGames }
