package com.insightglobal.day5;

import java.util.Date;

public class Contact {

    private String firstName;
    private String middleName;
    private String lastName;
    private Date dob;
    private String gender;
    private String mobileNumber;

    public Contact() {}

    public Contact(String firstName, String middleName, String lastName, Date dob, String gender, String mobileNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

   
    public boolean isValid() {
        if (firstName == null || firstName.isEmpty() ||
            lastName == null || lastName.isEmpty() ||
            mobileNumber == null || mobileNumber.isEmpty() ||
            gender == null || gender.isEmpty()) {
            return false;
        }
        
        return mobileNumber.matches("\\d{10}");
    }

    @Override
    public String toString() {
        return "Contact [FirstName=" + firstName + ", MiddleName=" + middleName + ", LastName=" + lastName + 
               ", DOB=" + dob + ", Gender=" + gender + ", MobileNumber=" + mobileNumber + "]";
    }
}
