package vehicles;

public class Car {
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
