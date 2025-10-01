package com.JavaLearning;

public class Stringsinjava {
    public static void main(String[] args) {
        // Method 1: Creating a string using a string literal
        // String literals are automatically stored in the String Constant Pool (SCP).
        String name = "Aryan";
        System.out.println(name);

        // Method 2: Creating a string using the 'new' keyword
        // This explicitly creates a new String object in the heap,
        // even if the same value already exists in the String Pool.
        String address = new String("India");
        System.out.println(address);

        // Example 1: Using 'new' keyword for identical strings
        String a = new String("Ram");
        String b = new String("Ram");

        // '==' checks whether both references point to the same memory location.
        // Here, two separate objects are created in the heap, so references differ.
        System.out.println(a == b); // Output: false

        // Example 2: Using string literals
        String c = "Ram";
        String d = "Ram";

        // For literals, JVM stores the first "Ram" in the String Pool.
        // When another literal "Ram" is encountered, JVM reuses the same reference.
        System.out.println(c == d); // Output: true

        // Note: If we want to compare the *values* of two strings,
        // we should use '.equals()' instead of '=='.
        System.out.println(a.equals(b)); // true, because values are the same
    }
}
