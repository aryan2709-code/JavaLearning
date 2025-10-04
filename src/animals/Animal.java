package animals;

// Info about runtime polymorphism : Method overriding

// Note: Java also uses a vtable-like mechanism internally.
// Each object carries a reference to its class metadata.
// The JVM stores a "method table" per class that maps virtual method calls
// to the correct implementation. All non-static, non-final, non-private
// methods are virtual by default, enabling runtime polymorphism.
// THIS IS CALLED DYNAMIC METHOD DISPATCH


public class Animal {
     private String name;
     private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat()
    {
        System.out.println("This animal eats food");
    }

    public void sayHello()
    {
        System.out.println("....");
    }
}
