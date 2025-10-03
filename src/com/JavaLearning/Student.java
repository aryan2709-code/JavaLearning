package com.JavaLearning;
// Program Execution Flow in Java:
// 1. JVM loads the class containing the main method.
// 2. All static variables and static blocks are initialized/executed.
// 3. JVM calls the static main() method to start program execution.
// 4. Inside main(), objects can be created and other methods can be called.


// This Program tries to demonstrate Encapsulation
public class Student {
    // A class has properties/fields/instance variables and behaviour
    private String name;
    private int rollNumber;
    private int age;

    // Default Constructor
    public Student() // Constructors have no return type
    {
        this.age = 10;
    }

    // Parameterised constructor
    public Student(String name, int rollNumber, int age)
    {
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }


    public void setAge(int age)
    {
        if(age < 0)
        {
            age = 0;
        }
        this.age = age;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setRollNumber(int roll)
    {
        this.rollNumber = roll;
    }

    public int getRollNumber()
    {
        return this.rollNumber;
    }

    public void setName(String name)
    {
       this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public static void main(String[] args) {

    }
}
