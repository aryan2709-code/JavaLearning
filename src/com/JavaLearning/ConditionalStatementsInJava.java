package com.JavaLearning;

public class ConditionalStatementsInJava {
    public static void main(String[] args) {
        // Relational operators compare two values and return a boolean result

//        String name = "Aryan";
//        int exp = 2;
//        boolean tier1 = true;
//
//        boolean cond = exp >= 5;
//        System.out.println(tier1 || cond); // true
//
//        int age = 2;
//        if(age >= 18)
//        {
//            System.out.println("You are an adult");
//        }
//        else
//        {
//            System.out.println("You are a child");
//        }

        int age = 50;
        int marks = 35;
        // 33/100 age 20
        if(age <= 20 && marks >= 33)
        {
            System.out.println("Congratulations, you have passed the exam!");
        }
        else
        {
            System.out.println("Better Luck next time!");
        }

        // marks >= 90 : A
        // marks >= 75 : B
        // marks >= 60 : C
        // D

        if(marks >= 90)
        {
            System.out.println("A");
        }
        else if(marks >= 75)
        {
            System.out.println("B");
        }
        else if(marks >= 60)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("D");
        }


        // Switch Case statements, can be used with strings , char and integer variables
        int day = 5;
        switch(day) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("Invalid day");
                break;
            }
        }

    }
}
