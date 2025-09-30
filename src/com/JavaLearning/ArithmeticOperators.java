package com.JavaLearning;

public class ArithmeticOperators {
    public static void main(String[] args) {


        int yourSalary = 1000;
        int bonus = 500;
        // Addition
        int total = yourSalary + bonus;
        System.out.println(total);

        int mySalary = 1500;
        int deduction = 500;
        // Subtraction
        int  myTotal = mySalary- deduction;
        System.out.println(myTotal);

        // Multiplication
        int yearlyTotal = myTotal * 12;
        System.out.println(yearlyTotal);

        // Division
        int childShare = yearlyTotal/3;
        System.out.println(childShare);

        // Modulus
        int a = 5;
        int b = 2;
        int remainder = a % b;
        System.out.println(remainder);

        System.out.println("Compound assignment operators");

        byte c = 10;
        // c = c + 5;  // This line will throw an error because (a+5) will become an integer and we can't store it in "a" which is of byte type

        c += 5; // This line has no error even though it does the same thing as above because compound assignment operators use implicit casting


        System.out.println("Increment and decrement operators priority");
        int d = 1;
        int e = d + ++d;
        System.out.println(e);
    }
}
