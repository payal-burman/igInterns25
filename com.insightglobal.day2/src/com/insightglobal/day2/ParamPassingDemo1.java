package com.insightglobal.day2;

public class ParamPassingDemo1 {
    public static void main(String[] args) {
      
        System.out.println("Before modify:");
        
        Student student = new Student(101, "Rahul");
        int number = 4;
        String name = "Samira";

        System.out.println("Student rollno: " + student.rollno);
        System.out.println("Student fname: " + student.fname);
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);

        student.modify(number); 
        student.modify(student); 
        student.modify(name); 

        System.out.println("\nAfter modify:");
        
        System.out.println("Student rollno: " + student.rollno); 
        System.out.println("Student fname: " + student.fname); 
        System.out.println("Number: " + number); 
        System.out.println("Name: " + name); 
    }
}
