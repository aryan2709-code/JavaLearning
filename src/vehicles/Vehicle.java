package vehicles;

public abstract class Vehicle {

    int speed; // Abstract class can have instance variables as well
    // Abstract classes can have their own constructors which can be used to initialise the base part of the sub-class
    public Vehicle()
    {
        System.out.println("Abstract class Vehicle's constructor called.");
    }

public abstract void accelerate();

public abstract void decelerate();

// Abstract classes can have regular methods too
    public void VehicleSpecs()
    {
        System.out.println("These are the specifications of the vehicle");
    }


}
