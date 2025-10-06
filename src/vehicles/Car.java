package vehicles;

public class Car extends Vehicle {

    public Car()
    {
        System.out.println("Car class' constructor called");
    }
    @Override
    public void accelerate() {
        System.out.println("Accelerating the car");
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating the car");
    }
}
