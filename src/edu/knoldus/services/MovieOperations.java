package edu.knoldus.services;

import edu.knoldus.entities.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieOperations {

    public List<Movie> makeMovieList() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Titanic", 1997, 9, "Romance"));
        movieList.add(new Movie("Golmaal", 2006, 8, "Comedy"));
        movieList.add(new Movie("Life", 2009, 6, "Sci-fi"));
        movieList.add(new Movie("The Mr.Bean", 2009, 9, "Comedy"));
        movieList.add(new Movie("All the Best", 2009, 6, "Comedy"));
        movieList.add(new Movie("The Conjuring", 2013, 5, "Scary"));
        movieList.add(new Movie("the Planet Earth", 2006, 7, "Sci-fi"));
        movieList.add(new Movie("Kahaani", 2012, 7, "Suspense"));
        return movieList;
    }

    public void performOperationsOnMovieList() {
        List<Movie> moviesList = makeMovieList();
        /* 1: List out all the movies with rating more than 8 and genre comedy.*/
        System.out.println("Movie with rating more than 8 and Genre is Comedy = ");
        moviesList.stream()
                .filter(search -> search.getRatings() >= 8 && search.getGenre()
                        .equals("Comedy"))
                .map(searchMovie -> searchMovie.getName()).forEach(System.out::println);

        /* 2: List out all the movies with release year greater than 2000 and rating less than 8.*/
        System.out.println("Movie With Rating less than 8 and rating is less than 8 = ");
        moviesList.stream()
                .filter(search -> search.getReleasedYear() > 2000 && search.getRatings() < 8)
                .map(searchMovie -> searchMovie.getName()).forEach(System.out::println);

        /* 3: List out all the movies with rating as even number.*/
        System.out.println("Movies with  rating in even number = ");
        moviesList.stream()
                .filter(search -> search.getRatings() % 2 == 0)
                .map(searchMovie -> searchMovie.getName()).forEach(System.out::println);

        /* 4: List out all the movies with rating equals to 7 and genre Sci-Fi.*/
        System.out.println("Movies With rating equal to 7 and genre Sci- Fi = ");
        moviesList.stream()
                .filter(search -> search.getRatings() == 7 && search.getGenre()
                        .equals("Sci-fi"))
                .map(searchMovie -> searchMovie.getName()).forEach(System.out::println);
    }
}
