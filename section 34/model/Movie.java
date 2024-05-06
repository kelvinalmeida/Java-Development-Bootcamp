package model;

public class Movie {
    private String title;
    private String actor;
    private String genre;
    private Integer year;
    private Double rating;

    public Movie(String title, String actor, String genre, Integer year, Double rating) {
        this.title = title;
        this.actor = actor;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public Movie(Movie source) {
        this.title = source.title;
        this.actor = source.actor;
        this.genre = source.genre;
        this.year = source.year;
        this.rating = source.rating;
    }
 
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return this.year;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getActor() {
        return actor;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    
}
