package com.insightglobal.core;

import java.util.Scanner;

public class Program1 {
    
    public static String getCapitalized(String sentence) {
       
        String[] words = sentence.split(" ");
        
        StringBuilder capitalizedSentence = new StringBuilder();
        
        for (String word : words) {
            // If the word is non-empty, capitalize the first letter and add it to the sentence
            if (!word.isEmpty()) {
                capitalizedSentence.append(word.substring(0, 1).toUpperCase())  
                                    .append(word.substring(1).toLowerCase()) 
                                    .append(" "); 
            }
        }
        
        // Remove the last space and return the final string
        return capitalizedSentence.toString().trim();
    }

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String capitalizedSentence = getCapitalized(sentence);
        System.out.println("Capitalized Sentence: " + capitalizedSentence);
        scanner.close();
    }
}
