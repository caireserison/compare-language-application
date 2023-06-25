package restservice.rest_service.models;

import java.util.ArrayList;
import java.util.List;

public class Games {
    public Games(String name, String owner, String releaseYear) {
        this.name = name;
        this.owner = owner;
        this.releaseYear = releaseYear;
    }

    private String name;
    private String owner;
    private String releaseYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
}

