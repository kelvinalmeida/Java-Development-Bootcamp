public class Store {

    private Movie[] movies;

    public Store() {
        this.movies = new Movie[10];
    }

    public Movie getMovie(int index) {
        return this.movies[index];
    }

    public void setMovie(int index, Movie movie) {
        this.movies[index] = new Movie(movie);
    }

    public String toString() {
        int count = 0;
        String temp = "";
        for (Movie movie : movies) {
            temp += (++count) + " " + movie.toString() + "\n";
        }
        return temp;
    }

}