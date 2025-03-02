package com.insight.StreamTask;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class AuthorMain {
    public static void main(String[] args) {
        List<Author> authors = Arrays.asList(
            new Author(12345L, "Smith", "John", "Doe", LocalDate.of(1990, 5, 15), "male", "New York", 9876543210L),
            new Author(12346L, "Johnson", "Emma", "Clark", LocalDate.of(1985, 8, 25), "female", "Los Angeles", 9876543211L),
            new Author(12347L, "Williams", "Sophia", "Brown", LocalDate.of(1992, 11, 10), "female", "New York", 9876543212L),
            new Author(12348L, "Jones", "Michael", "Davis", LocalDate.of(1988, 3, 3), "male", "Chicago", 9876543213L)
        );

        AuthorServiceImp authorService = new AuthorServiceImp();

        System.out.println("Unique Surnames: " + authorService.getUniqueSurnames(authors));
        System.out.println("Authors in New York: " + authorService.getAuthorsByCity(authors, "New York"));
        System.out.println("Female Average Age: " + authorService.femaleAverageAge(authors));
        System.out.println("Mobile number for Adhar card 12345: " + authorService.getMobileByAdhar(authors, 12345L));
    }
}
