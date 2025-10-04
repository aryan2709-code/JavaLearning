package testPackage;
import animals.Cat;
import animals.Dog;
import humans.Child;
import humans.Parent;
import vehicles.Car;
import vehicles.Cycle;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(); // able to create an instance of public class of another package
        Cycle cycle = new Cycle(); // same as above

        // Cycle.miniCycle // Can't be accessed even though miniCycle is a nested class , because its default access
        // Modifier is package-private only

        Dog dog = new Dog();
        // age and name are not public, so these properties cannot be accessed directly from a different package
        dog.setAge(2);
        dog.setName("Bob");
        dog.eat();
        dog.sayHello();

        Cat cat = new Cat();
        cat.setName("Billi");

        // Both dog and cat inherit from animal - Hierarchial Inheritance

        // child -> parent -> grandParent (Multilevel Inheritance)
        Child child = new Child();
        child.setName("Ram");
        child.setAge(8);

        Parent parent = new Parent();
        parent.setAge(30);
        parent.setName("Mukesh");


    }
}
