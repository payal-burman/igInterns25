package com.insightglobal.day2;

public class Student {
    int rollno;
    String fname;

    public Student(int rollno, String fname) {
        this.rollno = rollno;
        this.fname = fname;
    }

    public void modify(int number) {
        number = number + 1; 
    }
    public void modify(Student student) {
        student.rollno = student.rollno + 1; 
    }
    public void modify(String name) {
        name = "New Name"; 
    }
}

