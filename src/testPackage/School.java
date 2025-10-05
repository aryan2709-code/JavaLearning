package testPackage;

// If I have to enforce that only one instance of this School class exists in this application, then i would do this:
// Singleton Pattern
public class School {

    private static School instance; //private static instance of School
    // default value of object(instance) is NULL
    private School() // Private constructor
    {
        System.out.println("School constructor was called");
    }

    public static School getInstance()
    {
        if(instance == null)
        {
            instance = new School();
        }
        return instance;
    }

}
