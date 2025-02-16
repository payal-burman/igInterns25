package com.insightglobal.core;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        
        Address address1 = new Address("123 Main St", "Springfield", "IL", "62701");
        Address address2 = new Address("456 Oak St", "Champaign", "IL", "61820");
        Address address3 = new Address("123 Main St", "Springfield", "IL", "62701");  

        Student student1 = new Student("John", "Doe", 20, address1);
        Student student2 = new Student("Jane", "Smith", 22, address2);
        Student student3 = new Student("John", "Doe", 20, address3); 
        Student student4 = new Student("Alice", "Brown", 23, address1);

        HashSet<Student> studentSet = new HashSet<>();

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3); 
        studentSet.add(student4);

        System.out.println("Students in HashSet:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}

