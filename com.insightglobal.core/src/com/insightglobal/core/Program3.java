package com.insightglobal.core;

import java.util.Scanner;

public class Program3 {
    public static boolean validatePAN(String pan) {
       
        if (pan.length() != 8) {
            return false;
        }
        if (!Character.isUpperCase(pan.charAt(0)) || !Character.isUpperCase(pan.charAt(1)) || !Character.isUpperCase(pan.charAt(2))) {
            return false;
        }
        for (int i = 3; i < 7; i++) {
            if (!Character.isDigit(pan.charAt(i))) {
                return false;
            }
        }
        if (!Character.isUpperCase(pan.charAt(7))) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PAN number: ");
        String pan = scanner.nextLine();
        if (validatePAN(pan)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        scanner.close();
    }
}
