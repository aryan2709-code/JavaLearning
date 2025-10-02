package com.JavaLearning;

public class Cat extends Animal{ // Cat class is inheriting from Animal class
    String breed;

    public void makeSound() { // This method overrides the makeSound method in the Animal class
        System.out.println("Meow!");
    }
}
