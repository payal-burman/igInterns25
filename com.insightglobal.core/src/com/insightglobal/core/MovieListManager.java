package com.insightglobal.core;

import java.text.SimpleDateFormat;
import java.util.*;

public class MovieListManager {

    // Create a movie set (List of Movies)
    public List<Movie> createMovieSet() {
        List<Movie> movieList = new ArrayList<>();

        try {
            // SimpleDateFormat to parse dates
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            // Adding sample movies to the list
            movieList.add(new Movie("Movie A", "English", dateFormat.parse("2022-08-10"), "Director A", "Producer A", 120));
            movieList.add(new Movie("Movie B", "Hindi", dateFormat.parse("2021-07-15"), "Director B", "Producer B", 150));
            movieList.add(new Movie("Movie C", "English", dateFormat.parse("2023-05-20"), "Director C", "Producer C", 140));
            movieList.add(new Movie("Movie D", "Tamil", dateFormat.parse("2020-09-05"), "Director D", "Producer D", 130));
            movieList.add(new Movie("Movie E", "Hindi", dateFormat.parse("2021-11-25"), "Director E", "Producer E", 110));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return movieList;
    }

    // Sort movies by language (using Comparable interface in Movie class)
    public void sortByLanguage(List<Movie> movieList) {
        Collections.sort(movieList);  // Sorts based on the compareTo method (language)
    }

    // Sort movies by director (using Comparator interface)
    public void sortByDirector(List<Movie> movieList) {
        movieList.sort(new MovieComparators.DirectorComparator());
    }

    // Sort movies by duration (using Comparator interface)
    public void sortByDuration(List<Movie> movieList) {
        movieList.sort(new MovieComparators.DurationComparator());
    }

    // Print movie list
    public void printMovieList(List<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}
