package abstraction;

public class Test {

    public static void main(String[] args) {
        //Animal animal = new Animal(); // Abstract class can not be instantiated
        Animal dog = new Dog();
        dog.sayHello();
    }

}
