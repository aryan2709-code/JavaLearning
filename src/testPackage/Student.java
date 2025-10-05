package testPackage;

public class Student {

    public static int count = 0; // To track the number of instances of this class

    // Static blocks run automatically when the class is first loaded, making them ideal for class-level initialization before
    // any object is created.

    // Static Block
    static {
        System.out.println("Hello");
    }

    public Student()
    {
        count++;
    }

    private int id;
    private String name;
    public int age;

    public int getId()
    {
        return id;
    }

    public static void getCount()
    {
        System.out.println(count);
    }
}
