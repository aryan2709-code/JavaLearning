package com.JavaLearning;

public class StringMethods {
    static void main(String[] args) {
//        String name = "Ram";
//        int length = name.length();
//        System.out.println(length);
//
//        String myName = "Aryan Sharma";
//        char c = myName.charAt(6);
//        System.out.println(c);
//
//        String MineName = "Aryan Sharma";
//        boolean isEqual = myName.equals(MineName);
//        System.out.println(isEqual);
//
//        boolean ignoreCaseEqual = myName.equalsIgnoreCase(MineName);
//        System.out.println(ignoreCaseEqual);

        String str1 = "remote";
        String str2  = "car";
        System.out.println('r' + 0); //o/p : 114
        System.out.println('c' + 0); // o/p : 99
        int i = str1.compareTo(str2); // r's(str1[0]) ascii - c's(str2[0]) ascii = 15 // Lexicographical comparison takes place
        System.out.println(i); // o/p : 15
        int j = str1.compareTo(str1);
        System.out.println(j); //o/p is 0

        int k = str2.compareTo(str1);
        System.out.println(k); // o/p is -15

        String str3 = "Aryan";
        String str4 = "Aryans";
        System.out.println('s' + 0); // o/p : 115
        System.out.println(str4.compareTo(str3)); // o/p : 1
        // If one string is a prefix of other , then it returns the difference in their lengths
        // In the above example, its str4.length() - str3.length()


        String name = "Aman Panchal";
        String substring = name.substring(5,8); // 8th index is excluded, 5,6,7 indices will be there in the substring
        System.out.println(substring);

        // Upper case , lower case methods
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // Deleting the trailing or leading whitespaces
        String na = "  Hello    ";
        System.out.println(na.trim());

        // Strings are immutable, applying methods on a string doesn't change the original string, we get a new string.

        // Replace method
        name = "Aman Tyagi";
        String newSurname = name.replace("Tyagi","Sharma");
        System.out.println(newSurname); // Aman Sharma
        System.out.println(name); // Aman Tyagi

        // Contains method : to check whether a particular string or character is present in the string

        System.out.println(name.contains("Tya")); // true
        System.out.println(name.contains("Shar")); //false

        // starts with method -> prefix checking
        System.out.println(name.startsWith("Am")); // o.p : true
        // ends with method
        System.out.println(name.endsWith("gi"));

        String str = "  ";
        System.out.println(str.isEmpty()); //false
        System.out.println(str.isBlank()); // true

        System.out.println(name.indexOf('a')); //2
        System.out.println(name.lastIndexOf('a')); //7 is the op

        int a = 10;
        String s = String.valueOf(a);
        System.out.println(s);

        // Formatted string
        String formattedStr = String.format("My name is %s and I am %d years old.", "John", 25);
        System.out.println(formattedStr);

        // There is a subsequence method too which works similar as substring
    }
}
