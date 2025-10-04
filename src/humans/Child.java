package humans;

public class Child extends Parent{
public Child(int age, String name)
{
    super(age,name); // Used to call the parent class constructor, here we are calling a two-argument constructor
    System.out.println("Child constructor called");
}

public void childMethod()
{
    super.parentMethod(); // I can call any of the parent class methods through super keyword
    // Super keyword refers to the immediate parent
    System.out.println("Child method called");
}
}
