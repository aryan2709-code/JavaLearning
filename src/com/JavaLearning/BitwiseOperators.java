package com.JavaLearning;

public class BitwiseOperators {
    public static void main(String[] args) {
        // Computers store everything in binary notation
        //int a = 5;
       // System.out.println(Integer.toBinaryString(a)); // 101 is the output

        // Bitwise operators can only be used on Integral Values like byte, short, int, long

        // and operator &
        // or operator |
        // xor ^
        // not ~
        // left shift <<
        // right shift >>
        // unsigned right shift >>>

        int c = 5 & 4;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(c);

        int a = 5;
        System.out.println(Integer.toBinaryString(a));
        int b = ~a;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);

        b = a << 3; // a * 2 raised to the power 3 = 5 * 8 = 40
        System.out.println(b);
        b = b >> 3; // b / 2 raised to the power 3 = 40 / 8 = 5
        System.out.println(b);

        // Unsigned right shift
        int x = -8; // Binary (32-bit): 11111111 11111111 11111111 11111000
        System.out.println(Integer.toBinaryString(x));
        System.out.println("x = " + x);

        // Signed right shift >>
        System.out.println(Integer.toBinaryString(x>>2));
        System.out.println("x >> 2 = " + (x >> 2));
        // keeps sign bit (fills with 1s because the number is negative)

        // Unsigned right shift >>>
        System.out.println(Integer.toBinaryString(x>>>2));
        System.out.println("x >>> 2 = " + (x >>> 2));
        // fills with 0s at the left, so result becomes positive
    }
}
