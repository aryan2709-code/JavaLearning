package com.JavaLearning;

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types

        // Integral numbers
         //byte
         //short
         //int
         //long
        // decimal numbers
         // float
         // double
        // characters
         // char
         // booleans
         // bool

        // Integral Numbers
        byte age1 = 20;
        short age2 = 20;
        int age = 20;
        long age3 = 20;

//        System.out.println("Byte");
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);
//
//        System.out.println("Short");
//        System.out.println(Short.MIN_VALUE);
//        System.out.println(Short.MAX_VALUE);
//
//        System.out.println("Integer");
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//
//        System.out.println("Long");
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);

        // Decimal Numbers In Java
        float mySalary = 1000.111123112121f; // f is used to communicate to java that it is a float number
        double yourSalary = 1000.11112311212121;
        System.out.println(mySalary);
        System.out.println(yourSalary);

        // float has approx 7 decimal digits of precision
        // double has approx 15 decimal digits of precision

        mySalary =   105555555555555555555555555555500.11112311112121f;
        yourSalary = 105555555555555555555555555555500.11112311112121;

        System.out.println(mySalary);
        System.out.println(yourSalary);

        // The above two print statements give a number in scientific notation as o/p.

        // Float range
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        System.out.println("Float Minimum Value: " + floatMin);
        System.out.println("Float Maximum Value: " + floatMax);

        // Double range
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println("Double Minimum Value: " + doubleMin);
        System.out.println("Double Maximum Value: " + doubleMax);

        // Characters

        char initial = 'a';
        System.out.println(initial);
        // Every character is mapped to a numerical value
        System.out.println((int) initial); // o/p is 97 // This is typeCasting
        System.out.println("Character Ranges: ");
        System.out.println((int) Character.MIN_VALUE); // 0
        System.out.println((int) Character.MAX_VALUE); // 65535


        char heartSymbol = 10084;
        char rightSymbol = '\u27A4'; // Unicode representation
        System.out.println(heartSymbol);
        System.out.println(rightSymbol);

        for(int i=0; i<128; i++)
        {
            System.out.println((char) i);
        }

        boolean isEligible = false;
        System.out.println(isEligible);

        // Widening Conversion and loss
        byte byteValue = 10; // 1 byte
        short shortValue = byteValue; // short has 2 bytes
        int intValue = 10; //int has 4 bytes
        long longValue = intValue; // Widening Conversion from int to long // long has 8 bytes
        float floatValue = longValue; // Widening Conversion from long to float // float has 4 bytes but supports scientific notation for large numbers, that's why we are able to store a long value in a float variable
        double doubleValue = floatValue; // Widening Conversion from float to double // double has 8 bytes

        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        // Widening Conversion -> implicit conversion -> automatic conversion


        // Narrowing conversion -> Explicit conversion
        double doubleValue1 = 123.456;
        float floatValue1 = (float) doubleValue1; // Narrowing conversion from double to float
        long longValue1 = (long) floatValue1; // Narrowing conversion from float to long, because float supports scientific notations, it can store larger numbers than long despite having less bytes
        int intValue1  = (int) longValue1; // Narrowing conversion from long to int

        System.out.println("double: " + doubleValue1);
        System.out.println("float: " + floatValue1);
        System.out.println("long: " + longValue1);
        System.out.println("int: " + intValue1);

        long a = Long.MAX_VALUE; // 01111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111
        System.out.println(a);
        int b = (int) a; // 11111111 11111111 11111111 11111111 (2's complement representation of -1)
        System.out.println(b); //-1
    }
}
