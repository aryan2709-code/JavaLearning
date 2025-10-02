package com.JavaLearning;

public class UseOfClasses {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car car = new Car();
        car.color = "Blue";
        car.speed = 40;
        car.brand = "Tata";
        car.year = 2024;
        car.model = "Safari";

        car.accelerate(1);
        System.out.println(car.speed); // o.p : 41

        Cat cat = new Cat(); // Creating an object of the cat class
        cat.name = "Bob"; //these properties of cat was inherited from the parent class Animal
        cat.age = 5;
        cat.breed = "Jaat";

        // Polymorphism
        Animal cat1 = new Cat(); // Object is of Cat class but reference is of Animal class
        cat1.makeSound(); // Meow
        // We can assign an object of a subclass to a reference of superclass

        // Abstraction is hiding the underlying inner complexity/ hiding implementation details
    }
}
