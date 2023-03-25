package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class movieManagerTest {

    @Test
    public void addTest() {
        MovieManager addition = new MovieManager();

        addition.addMovie("Film 1");
        addition.addMovie("Film 2");
        addition.addMovie("Film 3");

        String[] expected = {
                "Film 1", "Film 2", "Film 3"
        };
        String[] actual = addition.outputMovie();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    // Constuctor public MovieManager() test when maxMoviePack > 10.
    public void lastAddedMoviesMore10Test() {
        MovieManager addition = new MovieManager();

        addition.addMovie("Film 1");
        addition.addMovie("Film 2");
        addition.addMovie("Film 3");
        addition.addMovie("Film 4");
        addition.addMovie("Film 5");
        addition.addMovie("Film 6");
        addition.addMovie("Film 7");
        addition.addMovie("Film 8");
        addition.addMovie("Film 9");
        addition.addMovie("Film 10");
        addition.addMovie("Film 11");

        String[] expected = {
                "Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2"
        };
        String[] actual = addition.lastAddedMovie();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    // Constuctor public MovieManager() test when maxMoviePack < 10.
    public void lastAddedMoviesLess10Test() {
        MovieManager addition = new MovieManager();

        addition.addMovie("Film 1");
        addition.addMovie("Film 2");

        String[] expected = {
                "Film 2", "Film 1"
        };
        String[] actual = addition.lastAddedMovie();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    // Constuctor public MovieManager() test when maxMoviePack = 0.
    public void lastAddedMoviesZeroTest() {
        MovieManager addition = new MovieManager();

        String[] expected = {};
        String[] actual = addition.lastAddedMovie();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    // Constuctor public MovieManager(int moviePack) test when maxMoviePack < 10.
    public void lastAddedMoviesLess10ParamTest() {
        MovieManager addition = new MovieManager(7);

        addition.addMovie("Film 1");
        addition.addMovie("Film 2");
        addition.addMovie("Film 3");
        addition.addMovie("Film 4");
        addition.addMovie("Film 5");
        addition.addMovie("Film 6");
        addition.addMovie("Film 7");

        String[] expected = {
                "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"
        };
        String[] actual = addition.lastAddedMovie();

        Assertions.assertArrayEquals(expected, actual);

    }

}
