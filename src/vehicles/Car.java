package vehicles;

public final class Car extends Vehicle { // This class (car) has been declared as final, now it cannot be inherited

    private final int speedLimit = 200; //No one can change this now

    // There can't be any setter method for this speedLimit property, it is "FIXED" because of final variable

    public final void airbags() // Final keyword prohibits this method from being overridden in its subclasses
    {
        System.out.println("4 Airbags!");
    }

    // Another Info : Constructors cannot be made final, because constructors are not even inherited, so no point of making them
    // final because something that is not inherited can't be overridden by default


    public static void main(String[] args) {
//        miniCycle MiniCycle = new miniCycle(); // able to create an instance of the non-public class miniCycle  in the other
//        // class of the same package without any problem whatsoever

        // Now, if miniCycle is defined inside the Cycle class (nested class),
        // To create an instance of the miniCycle class , i first need to create an instance of the enclosing class,
        // i.e the cycle class

        Cycle cycle = new Cycle();
        Cycle.miniCycle MiniCycle = cycle.new miniCycle(); // cycle instance is needed to call the new method for
        // creating the instance




    }
}
