package com.JavaLearning;

public class ArraysInJava {
    public static void main(String[] args) {  // Use public for JVM entry point

        // 1. Declaring and Initializing Arrays
        int[] arr1 = {1, 2, 3, 4}; // Direct initialization
        System.out.println("arr1 elements:");
        for (int value : arr1) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

        // 2. Array with fixed size
        int[] arr = new int[10];
        // By default, all elements are 0
        arr[3] = 43;
        arr[5] = 89;
        arr[9] = 99;

        System.out.println("arr elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        // 3. Using for-each loop
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("arr2 elements (for-each loop):");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 4. 2D Array (Matrix)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("2D Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { // matrix[i].length for flexibility
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 5. Jagged Array (array of arrays with different lengths)
        char[][] jaggedArray = new char[3][]; // only first dimension fixed
        jaggedArray[0] = new char[2]; // first row with 2 elements
        jaggedArray[1] = new char[4]; // second row with 4 elements
        jaggedArray[2] = new char[3]; // third row with 3 elements

        // Fill jagged array with some characters
        char ch = 'A';
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = ch++;
            }
        }

        System.out.println("Jagged Array elements:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
