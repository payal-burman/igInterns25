package com.insightglobal.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StackTest {

    public static void main(String[] args) {
        try {
           
            Stack contactStack = new Stack(3);

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date dob1 = sdf.parse("01-01-1990");
            Contact contact1 = new Contact("John", "Doe", "Smith", dob1, "Male", "1234567890");

            Date dob2 = sdf.parse("12-03-1985");
            Contact contact2 = new Contact("Jane", "Mary", "Doe", dob2, "Female", "9876543210");

            Date dob3 = sdf.parse("20-07-2000");
            Contact contact3 = new Contact("Sam", "Alex", "Brown", dob3, "Male", "1122334455");

    
            contactStack.push(contact1);
            
            contactStack.push(contact2);  
            
            contactStack.push(contact3);  

            contactStack.push(new Contact("Failed", "Test", "User", sdf.parse("10-10-1999"), "Female", "123456")); 

        } catch (ParseException | StackFullException | InvalidContactException e) {
            System.out.println(e.getMessage());
        }

        try {
           
            Stack contactStack = new Stack(3);
            contactStack.push(new Contact("John", "Doe", "Smith", new Date(), "Male", "1234567890"));
            contactStack.push(new Contact("Jane", "Doe", "Smith", new Date(), "Female", "0987654321"));
            
            contactStack.pop();  
            contactStack.pop();  

           
            contactStack.pop(); 

        } catch (StackEmptyException | StackFullException | InvalidContactException e) {
            System.out.println(e.getMessage());
        }
    }
}
