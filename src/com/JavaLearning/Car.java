package com.JavaLearning;

public class Car {
    // Properties
    String color;
    String brand;
    String model;
    int year;
    int speed;

    // Methods
    public void accelerate(int increment)
    {
        speed += increment;
    }

    public void brake(int decrement)
    {
        speed -= decrement;
        if(speed <= 0)
            speed = 0;
    }
}

// Encapsulation is the bundling of data and methods in a single unit called class, to prevent unrestricted access to the data.
// Inheritance is the property of OOP through which a child class can inherit properties from a parent class.
