package edu.knoldus.entities;

public class Movie {
    String name;
    int releasedYear;
    float ratings;
    String genre;

    public Movie(String name, int releaseYear, int ratings, String genre) {
        this.name = name;
        this.releasedYear = releaseYear;
        this.ratings = ratings;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public float getRatings() {
        return ratings;
    }

    public String getGenre() {
        return genre;
    }

}
