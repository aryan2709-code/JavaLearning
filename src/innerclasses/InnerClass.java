package innerclasses;

public class InnerClass {
    public static void main(String[] args)
    {
        // There are four types of inner classes In Java
        // . Member Inner Class
        // . Static Nested Class
        // . Local Inner Class
        // . Anonymous Inner Class


        // Information About Member Inner Classes In Java:
        // . A member inner class is a non-static class defined inside another class
        // . Each inner class object is implicitly attached with exactly one object of the outer class.
        // . It can directly access all members of the outer class, including private instance variables
        // . and methods.
        // . It cannot exist independently of the outer class
        // . To create a Member Inner Class Object, you must use an outer class object

        // Information about Static Nested Class or Static Inner Class In Java:
        // . A static nested class is a static class defined inside another class
        // . It is not associated with any instance of the outer class
        // . It belongs to the outer class itself, not to its objects
        // . It can access only the static members of the outer class directly.
        // . It can not access instance variables or instance methods of the outer class.
        // . It can exist independently of the outer class objects
        // . To create it, no outer object is required.

        // Information about anonymous inner class
        // . An anonymous inner class is a class without a name
        // . It is defined and instantiated at the same time.
        // . It can extend one class or implement one interface
        // . It cannot have constructors as there is no class name.
        // . It cannot define static members except constants.
        // . It is used when you need an one time short implementation.

        // Information about local inner classes
        // A local inner class is a class defined inside a method,constructor, or block.
        // Its scope is limited to that method or block
        // It cannot be accessed outside the method where it is defined.
        // It can access all members of the outer class and local variables only if they are
        // final or effectively final
        // It cannot declare static members except constants
        // It can have constructors
        // It is defined or used when a helper class is needed only within a single method.


    }
}
