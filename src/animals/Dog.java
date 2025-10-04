package animals;

public class Dog extends Animal{

    // Override annotation : If there is an error or mistake in overriding, it will get flagged by The IDE or during the compile time
    @Override
    public void sayHello()
    {
        System.out.println("woof");
    }
}
