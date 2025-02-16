package com.insightglobal.day2;

public class ParamPassingDemo2 {
	public static void swap(int a, int b) {
		System.out.println("Before swap (int): a = " + a + ", b = " +b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap (int): a = " + a + ", b = " +b);
	}
	
	public static void swap(int[] array1, int[] array2) {
		 System.out.println("Before swap (array):");
	        System.out.print("array1 = ");
	        printArray(array1);
	        System.out.print("array2 = ");
	        printArray(array2);
	        
	        int[] temp = array1;
	        array1 =array2;
	        array2 =temp;
	        
	        System.out.println("After swap (array):");
	        System.out.print("array1 = ");
	        printArray(array1);
	        System.out.print("array2 = ");
	        printArray(array2);
	}
	
	public static void printArray(int[] array) {
		System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
	}
	
	public static void main(String[] args) {
		int x = 5;
        int y = 10;
        System.out.println("Before calling swap(int, int):");
        System.out.println("x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After calling swap(int, int):");
        System.out.println("x = " + x + ", y = " + y);
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println("\nBefore calling swap(int[], int[]):");
        System.out.print("array1 = ");
        printArray(array1);
        System.out.print("array2 = ");
        printArray(array2);
        swap(array1, array2);
        System.out.println("After calling swap(int[], int[]):");
        System.out.print("array1 = ");
        printArray(array1);
        System.out.print("array2 = ");
        printArray(array2);

        
	}

}
