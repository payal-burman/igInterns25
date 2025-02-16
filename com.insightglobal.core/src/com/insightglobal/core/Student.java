package com.insightglobal.core;

public class Student {
 private String firstName;
 private String lastName;
 private int age;
 private Address address;

 public Student(String firstName, String lastName, int age, Address address) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
     this.address = address;
 }

 public String getFirstName() {
     return firstName;
 }

 public String getLastName() {
     return lastName;
 }

 public int getAge() {
     return age;
 }

 public Address getAddress() {
     return address;
 }

 public String getFullName() {
     return firstName + " " + lastName;
 }

 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     Student student = (Student) obj;
     return getFullName().equals(student.getFullName()) && address.equals(student.address);
 }

 @Override
 public int hashCode() {
     return getFullName().hashCode() + address.hashCode();
 }

 @Override
 public String toString() {
     return "Student{name='" + firstName + " " + lastName + "', age=" + age + ", address=" + address + "}";
 }
}
