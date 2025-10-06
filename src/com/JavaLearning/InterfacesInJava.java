package com.JavaLearning;

public class InterfacesInJava {
    // A class is a blueprint for creating objects.
    // An interface is a blueprint for a class.
    // Interfaces can contain only abstract methods (implicitly public and abstract) and static final constants.
    // Interfaces help achieve abstraction and multiple inheritance in Java.

    // Difference between Interfaces and Abstract Classes In Java:

    // Abstract classes can have both abstract and concrete methods
    // Interfaces have all methods abstract by default except static and default methods

    // Abstract classes can have instance and static variables.
    // Interfaces have only public,static,final(constant) variables

    // Abstract classes can have any access modifier
    // Interfaces have all methods as public implicitly, cannot reduce visibility

    // Abstract classes can have constructors, that can be used to initialise the base part of a derived class
    // Interfaces cannot have constructors

    // A class can extend only one abstract or normal class
    // A class can extend multiple interfaces

}
