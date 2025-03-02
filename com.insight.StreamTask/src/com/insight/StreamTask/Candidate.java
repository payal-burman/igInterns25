package com.insight.StreamTask;

public class Candidate {

    private String name;
    private String technicalExpertise;
    private String city;
    private int experience;

    public Candidate(String name, String technicalExpertise, String city, int experience) {
        this.name = name;
        this.technicalExpertise = technicalExpertise;
        this.city = city;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getTechnicalExpertise() {
        return technicalExpertise;
    }

    public String getCity() {
        return city;
    }

    public int getExperience() {
        return experience;
    }
}
