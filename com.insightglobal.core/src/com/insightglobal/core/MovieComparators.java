package com.insightglobal.core;

import java.util.Comparator;

public class MovieComparators {

    // Comparator for sorting by Director
    public static class DirectorComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie m1, Movie m2) {
            return m1.getDirector().compareTo(m2.getDirector());
        }
    }

    // Comparator for sorting by Duration
    public static class DurationComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie m1, Movie m2) {
            return Integer.compare(m1.getDuration(), m2.getDuration());
        }
    }
}
