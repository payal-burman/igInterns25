package com.insight.StreamTask;

import java.time.LocalDate;

public class Author {

    private Long adharCard;
    private String surname;
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private String gender;
    private String city;
    private Long mobile;


    public Author(Long adharCard, String surname, String firstname, String lastname, LocalDate birthdate, String gender, String city, Long mobile) {
        this.adharCard = adharCard;
        this.surname = surname;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.city = city;
        this.mobile = mobile;
    }

    public Long getAdharCard() {
        return adharCard;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public Long getMobile() {
        return mobile;
    }
}
