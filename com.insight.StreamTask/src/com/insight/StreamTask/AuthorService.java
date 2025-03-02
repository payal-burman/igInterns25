package com.insight.StreamTask;

import java.util.List;
import java.util.Set;

public interface AuthorService {
    Set<String> getUniqueSurnames(List<Author> authorList);
    List<Author> getAuthorsByCity(List<Author> authorList, String city);
    double femaleAverageAge(List<Author> authorList);
    Long getMobileByAdhar(List<Author> authorList, Long adharCard);
}
