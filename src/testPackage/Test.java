package testPackage;
import vehicles.Car;
import vehicles.Cycle;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(); // able to create an instance of public class of another package
        Cycle cycle = new Cycle(); // same as above

        // Cycle.miniCycle // Can't be accessed even though miniCycle is a nested class , because its default access
        // Modifier is package-private only
    }
}
