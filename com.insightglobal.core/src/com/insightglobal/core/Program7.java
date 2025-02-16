package com.insightglobal.core;

import java.util.Scanner;

public class Program7 {
    public static String convertFormat(String number) {

        String digitsOnly = number.replace("-", "");
        String formattedNumber = digitsOnly.substring(0, 2) + "-" +
                                 digitsOnly.substring(2, 4) + "-" +
                                 digitsOnly.substring(4, 7) + "-" +
                                 digitsOnly.substring(7, 10);

        return formattedNumber;
    }

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 10-digit number (XXX-XXX-XXXX format): ");
        String inputNumber = scanner.nextLine();
        String result = convertFormat(inputNumber);
        System.out.println("Formatted number: " + result);
        scanner.close();
    }
}
