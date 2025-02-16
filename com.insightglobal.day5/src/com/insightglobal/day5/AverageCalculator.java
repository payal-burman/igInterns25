package com.insightglobal.day5;

public class AverageCalculator {

    public double calAverage(int n) {
        // Check if n is a natural number (n > 0)
        if (n <= 0) {
            throw new IllegalArgumentException("The value of n must be a positive integer (natural number).");
        }

        // Formula for the average of first n natural numbers: (n * (n + 1)) / (2 * n)
        double sum = (n * (n + 1)) / 2.0;  
        return sum / n;  
    }

    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();

        try {
            System.out.println("Average of first 5 natural numbers: " + calculator.calAverage(5));
            System.out.println("Average of first 10 natural numbers: " + calculator.calAverage(10));

      
            System.out.println("Average of first -3 natural numbers: " + calculator.calAverage(-3));  
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  
        }
    }
}
