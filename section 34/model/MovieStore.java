package model;

import java.util.ArrayList;
import java.util.List;

public class MovieStore {
    private List<Movie> movies;


    public MovieStore() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(new Movie(movie));
    }

    public List<Movie> filterByGenre(String genre) {
        return movies.stream().filter(movie -> movie.getGenre().equals(genre)).toList();
    }


    public List<Movie> sortByReleaseYear() {
        return movies.stream().sorted((left, right) -> left.getYear().compareTo(right.getYear())).toList();
    }


    public List<Movie> getTopRatedMovies(long n) {
        
        return movies.stream().sorted((left, right) -> right.getRating().compareTo(left.getRating())).limit(n).toList();
    }

}
