package com.insight.StreamTask;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

    public static void main(String[] args) {
  
        List<Candidate> candidateList = InterviewRepository.getCandidateList();

        // Task 1: List candidate names from Pune city
        System.out.println("List of Pune Candidates:");
        candidateList.stream().filter(c -> "Pune".equals(c.getCity())).map(Candidate::getName).forEach(System.out::println);

        printLine();

        // Task 2: List city and count of candidates per city
        System.out.println("Candidate count per city:");
        Map<String, Long> cityCount = candidateList.stream().collect(Collectors.groupingBy(Candidate::getCity, Collectors.counting()));
        cityCount.forEach((city, count) -> System.out.println(city + ": " + count));

        printLine();

        // Task 3: List technical expertise and count of candidates
        System.out.println("Candidate count by Technical Expertise:");
        Map<String, Long> expertiseCount = candidateList.stream().collect(Collectors.groupingBy(Candidate::getTechnicalExpertise, Collectors.counting()));
        expertiseCount.forEach((expertise, count) -> System.out.println(expertise + ": " + count));

        printLine();

        // Task 4: List fresher candidates (Experience 0)
        System.out.println("Fresher Candidate list:");
        candidateList.stream().filter(c -> c.getExperience() == 0).map(Candidate::getName).forEach(System.out::println);

        printLine();

        // Task 5: Listing candidates with highest experience
        System.out.println("Sorted List of Candidates by Experience:");
        candidateList.stream().sorted(Comparator.comparingInt(Candidate::getExperience).reversed()).forEach(c -> System.out.println(c.getName() + " (" + c.getExperience() + " years)"));

        printLine();

        // Task 6: Sort the candidates by city name
        System.out.println("Sorted List of Candidates by City Name:");
        candidateList.stream().sorted(Comparator.comparing(Candidate::getCity)).forEach(c -> System.out.println(c.getName() + " - " + c.getCity()));
    }

    private static void printLine() {
        System.out.println("======================================================");
    }
}
