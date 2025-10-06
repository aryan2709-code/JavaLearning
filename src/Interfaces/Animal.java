package Interfaces;

public interface Animal {

    // public static final int MAX_AGE = 30;
    // 'public', 'static', and 'final' are redundant because:
    // All variables declared in an interface are implicitly public, static, and final (i.e., constants).
    int MAX_AGE = 30;

    // 'public' and 'abstract' are redundant here.
    // All methods in an interface (without a body) are implicitly public and abstract.
    void eat();

    // Explanation:
    // 1. Every class implementing the interface must provide a public implementation for all abstract methods.
    //    This ensures that the class fulfills the contract defined by the interface.
    // 2. Interface methods cannot have a body unless they are 'default' or 'static',
    //    so they are abstract by design.
    // 3. An interface defines a contract — it specifies *what behavior* an implementing class must provide.
    // 4. When a class implements an interface, it promises to provide publicly accessible versions of these methods
    //    so that they can be called through the interface reference.

    void sleep();

    // Interfaces can also have static and default methods (introduced in Java 8).

    public static void info() {
        System.out.println("This is an actual interface.");
    }

    // This is a default (concrete) method.
    // - All implementing classes inherit this method.
    // - It can be invoked using instances of the implementing classes.
    public default void run() {
        this.eat(); // Default methods are called on instances, so 'this' refers to the current implementing object.
        System.out.println("Animal is running");
    }

    // Importance of default methods:
    // Suppose we need to add a new method to an existing interface.
    // If we declare it as an abstract method, all implementing classes (possibly 100+) must define it.
    // To avoid breaking existing code, we can define it as a default method with a body.

    private void privateInfo() {
        // Private methods allow internal helper logic to remain hidden within the interface.
        System.out.println("Private information about the interface.");
    }

    // Private methods can be called only by other methods within the same interface (default or private methods).

    private static void staticInfo() {
        // Private static methods can be called only by other static methods in the same interface.
        System.out.println("Static private info inside interface.");
    }
}
