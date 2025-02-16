package com.insightglobal.core;

import java.util.Scanner;

public class Program5 {

    public static String getLastLetter(String sentence) {
       
        String[] words = sentence.split(" ");
       
        StringBuilder result = new StringBuilder();
     
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(word.length() - 1)));
            }
        }
      
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String finalString = getLastLetter(sentence);
        System.out.println("Final string: " + finalString);
        scanner.close();
    }
}
