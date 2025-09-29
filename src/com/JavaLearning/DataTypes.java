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

    }
}
