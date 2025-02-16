package com.insightglobal.core;

import java.util.Scanner;

public class Program6 {

    public static int calculateWordSum(String sentence) {
       
        String[] words = sentence.split(" ");
        if (words.length == 0) {
            return 0;  
        }

        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        if (firstWord.equals(lastWord)) {
            return firstWord.length(); 
        } else {
     
            return firstWord.length() + lastWord.length();
        }
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int result = calculateWordSum(sentence);
        System.out.println("Result: " + result);
        scanner.close();
    }
}
