package Interfaces;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        System.out.println(Dog.max_age);
        dog.run(); //run is a default method defined inside the interface


        Animal.info();
        // Static methods of an interface can be called only through the interface, not through any of its implementing class

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        System.out.println(Cat.max_age);
        cat.run();

    }
}
