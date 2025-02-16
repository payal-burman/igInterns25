package com.insightglobal.core;

import java.util.Scanner;

public class Program2 {

    public static Integer findMaxDistance(int[] array, int n) {
        int maxDifference = 0;
        int indexOfLarger = -1;
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]);
            if (diff > maxDifference) {
                maxDifference = diff;
                indexOfLarger = (array[i] > array[i + 1]) ? i : (i + 1);
            }
        }
        
        return indexOfLarger;
    }

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Integer result = findMaxDistance(array, n);
        System.out.println("Index of larger number with maximum difference: " + result);
        scanner.close();
    }
}
