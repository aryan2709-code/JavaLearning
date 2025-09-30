package com.JavaLearning;

import java.util.Locale;

public class PrintStatement {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // System is a class that contains system related utility methods (those methods that interact with the system's runtime environment)
        // Out is a static member of the system class that is connected to the console

        // println gives a new line character at last
        // print does not give any new line character at last

        int a = 1;
        int b = 2;
        String c = "Sum";
        char d = 'd';
        float e = 1.2f;
        System.out.println(a + b);
        System.out.println("Hello" + " " + "World");
        System.out.println(a + b + c); // a + b = (1 + 2) = 3(integer) + "Sum" = 3Sum
        System.out.println(c + a + b); // c + a = Sum + 1 = Sum1(String) + 2(Integer) = Sum12
        System.out.println(c + (a+b)); // Bracket gets resolved first, so it is Sum3


        System.out.println(c + " of " + a + " & " + b + ": " + (a+b)); //Sum of 1 & 2: 3
        // Focus on printf
        System.out.printf("%s of %d & %d: %d", c, a, b, a + b); //Sum of 1 & 2: 3
        // printf helps us to print things in a cleaner fashion
        System.out.println();


        // %c -> character
        // %f -> float
        // %d -> Integer
        // %s -> string
        System.out.printf("%c %.2f",d,e); //.2 helps to print only two numbers after decimal
        System.out.println();


        // Locale
        double number = 1234567.89;
        //Default locale:
        System.out.printf("Default Locale: %,.2f%n", number);
        // US Locale
        System.out.printf(Locale.US, "US Locale : %,.2f%n",number);
        // German Locale
        System.out.printf(Locale.GERMANY,"German Locale : %,.2f%n", number);
    }
}
