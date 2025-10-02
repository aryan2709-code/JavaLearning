package com.JavaLearning;

public class UseOfClasses {

    // Method that changes the properties of Cat class
    public static Cat makeCatNameUpperCase(Cat cat) {
        cat.name = cat.name.toUpperCase();
        return cat;
    }

    public static void main(String[] args) {
        // Creating an object of the Car class
        Car car = new Car();
        car.color = "Blue";
        car.speed = 40;
        car.brand = "Tata";
        car.year = 2024;
        car.model = "Safari";

        car.accelerate(1);
        System.out.println(car.speed); // Output: 41

        // Creating an object of the Cat class
        Cat cat = new Cat();
        cat.name = "Bob";   // These properties were inherited from the parent class Animal
        cat.age = 5;
        cat.breed = "Jaat";

        // Polymorphism: Object is of Cat class, reference is of Animal class
        Animal cat1 = new Cat();
        cat1.makeSound(); // Output: Meow
        // We can assign an object of a subclass to a reference of the superclass

        // Abstraction: Hiding the underlying implementation details

        // Passing object reference to a method
        Cat a = new Cat();
        a.name = "bob";
        Cat cat2 = makeCatNameUpperCase(a);

        System.out.println(a.name);    // Output: BOB
        System.out.println(cat2.name); // Output: BOB
    }
}
