package abstraction;

// Access Modifier Rules in Java:
//
// 1. No modifier → default (package-private)
//    - Visible only within the same package.
//
// 2. private → Visible only within the same class.
//
// 3. protected → Visible within the same package AND to subclasses
//    (even if the subclass is in a different package).
//
// 4. public → Visible from anywhere.
//
// ⚡ Notes:
// - Top-level classes can only be public or package-private (not private/protected).
// - Fields, methods, and inner classes can use all four modifiers.
// - Access modifiers enforce encapsulation and controlled visibility.

public abstract class Animal {

    private int age;      // Encapsulated property (accessible only within Animal)
    private String name;  // Encapsulated property (accessible only within Animal)

    private boolean hasSuperPowers;
    // Constructor
    // Since the current class is an abstract class, its object will never be instantiated directly,
    // so its constructor will only be called in child classes, so making this protected is enough
    // Protected -> accessible in any subclass even though it may be in a different package
    protected Animal()
    {
        this.hasSuperPowers = false;
    }

    //Abstract Method
    // Must be implemented by any concrete subclass.
    // If declared public/protected → subclass can be in any package.
    // If declared with default (package-private) → subclass must be in the same package.
    public abstract void sayHello();

    //Concrete Method
    // An abstract class can also provide fully defined methods.
    public void sleep() {
        System.out.println("zzzzzzz......");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
