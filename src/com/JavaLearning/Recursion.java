package com.JavaLearning;

public class Recursion {

    // method to find factorial by iterations
    public static int factorial(int n)
    {
        int res = 1;
        for(int i=1; i<= n; i++)
        {
            res = res * i;
        }
        return res;
    }

    // method to find factorial by recursion
    public static int factorialRec(int n)
    {
        // Base case :
        if(n == 0 || n == 1)
        {
            return 1;
        }

        return n * factorialRec(n-1);
    }

    public static void main(String[] args) {
        int res1 = factorial(5);
        int res2 = factorialRec(5);

        System.out.println(res1 + " " + res2); // 120 120
    }
}
