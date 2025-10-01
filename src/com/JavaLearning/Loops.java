package com.JavaLearning;

public class Loops {
    public static void main(String[] args) {

        // While loop
        int i = 0;
        while(i < 10){
            System.out.println("Hello World");
            i = i + 1;
        }

        // Do while loop
        int j = 1;
        do{
            System.out.println(j++);
        }while (j <= 50);

        // for loop
        for(int k=1; k<=10; k++)
        {
            System.out.println(k);
        }

        // break and continue statements are used in the same way as they were used in C++
    }
}
