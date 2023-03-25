package ru.netology;

public class MovieManager {

    private String[] movies = new String[0];
    private int maxMoviePack;

    public MovieManager() {
        maxMoviePack = 10;
    }

    public MovieManager(int moviePack) {
        this.maxMoviePack = moviePack;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public String[] outputMovie() {
        return movies;
    }

    public String[] lastAddedMovie() {
        int moviePackLength;
        if (movies.length < maxMoviePack) {
            moviePackLength = movies.length;
        } else {
            moviePackLength = maxMoviePack;
        }
        String[] lastOutput = new String[moviePackLength];

        for (int i = 0; i < lastOutput.length; i++) {
            lastOutput[i] = movies[movies.length - 1 - i];
        }
        return lastOutput;

    }

}
