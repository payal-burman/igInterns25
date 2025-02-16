package com.insightglobal.core;
import java.util.Scanner;

public class Program4 {

    public static String reshape(String str, char separator) {
      
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < reversedStr.length(); i++) {
           
            result.append(reversedStr.charAt(i));
         
            if (i < reversedStr.length() - 1) {
                result.append(separator);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the separator character: ");
        char separator = scanner.next().charAt(0);
        String reshapedStr = reshape(str, separator);
        System.out.println("Final reshaped string: " + reshapedStr);
        scanner.close();
    }
}
