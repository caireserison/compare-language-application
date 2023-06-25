public class Games {
    public Games(string name, string owner, string releaseYear) {   
        this.Name = name;
        this.Owner = owner;
        this.ReleaseYear = releaseYear;
    }

    public string Name {get; set;}
    public string Owner {get; set;}
    public string ReleaseYear {get; set;}

    override
    public string ToString() {
        return "Name: " + Name + "; Owner: " + Owner + "; ReleaseYear: " + ReleaseYear + ";";
    }
}

public static class AllGames {
    public static List<Games> listGames = new List<Games>();
}