package com.JavaLearning;

public class MethodsInJava {

    /*
        SYNTAX OF A METHOD:
        accessModifier returnType methodName(parameters) {
            // method body
        }
    */

    // 1. Non-static method: Sum of array elements
    public void sumOfArray(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result += num;
        }
        System.out.println("Sum of array elements = " + result);
    }

    // 2. String processing method
    // Removes spaces from start/end and returns the string in uppercase
    private static String toUpperTrimmed(String str) {
        return str.trim().toUpperCase();
    }

    // 3. Method Overloading Example
    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // 4. Variable arguments method
    public static int sumOfNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // 5. Helper: Print a separator line
    private static void printSeparator() {
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10};

        // Object creation to call non-static method
        MethodsInJava obj = new MethodsInJava();

        // 1. Calling non-static method
        printSeparator();
        obj.sumOfArray(arr); // Output: Sum of array elements = 23

        // 2. Calling string method
        printSeparator();
        String result = toUpperTrimmed("   arYan   ");
        System.out.println("Processed string = " + result); // Output: ARYAN

        // 3. Method Overloading demo
        printSeparator();
        System.out.println("sum(2, 3) = " + sum(2, 3));         // Output: 5
        System.out.println("sum(2, 3, 4) = " + sum(2, 3, 4));   // Output: 9

        // 4. Variable arguments method
        printSeparator();
        System.out.println("sumOfNumbers(1, 2, 3, 4) = " + sumOfNumbers(1, 2, 3, 4));         // Output: 10
        System.out.println("sumOfNumbers(1, 2, 3, 4, 5) = " + sumOfNumbers(1, 2, 3, 4, 5));   // Output: 15
        printSeparator();
    }
}
