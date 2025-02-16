package com.insightglobal.core;

import java.util.List;

public class MainMovie {

    public static void main(String[] args) {
        MovieListManager movieListManager = new MovieListManager();

        // Create a movie list
        List<Movie> movieList = movieListManager.createMovieSet();

        // Print the movie list before sorting
        System.out.println("Movie List before sorting:");
        movieListManager.printMovieList(movieList);

        // Sort by language
        movieListManager.sortByLanguage(movieList);
        System.out.println("\nMovie List sorted by language:");
        movieListManager.printMovieList(movieList);

        // Sort by director
        movieListManager.sortByDirector(movieList);
        System.out.println("\nMovie List sorted by director:");
        movieListManager.printMovieList(movieList);

        // Sort by duration
        movieListManager.sortByDuration(movieList);
        System.out.println("\nMovie List sorted by duration:");
        movieListManager.printMovieList(movieList);
    }
}


