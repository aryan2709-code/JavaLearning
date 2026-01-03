package innerclasses;

public class Car {
    private String model;
    private boolean isEngineOn;

    // Constructor
    public Car(String model)
    {
        this.model = model;
        this.isEngineOn = false;
    }

    // Inner Class Engine Is defined here
    // Engine is a member inner class of the class car
    class Engine{
        void start()
        {
            if(!isEngineOn)
            {
                isEngineOn = true;
                System.out.println(model + " engine started.");
            }
            else
            {
                System.out.println(model + " engine is already on.");
            }
        }

        void stop()
        {
            if(isEngineOn)
            {
                isEngineOn = false;
                System.out.println(model + " engine stopped.");
            }
            else
            {
                System.out.println("Engine is already off.");
            }
        }

    }

}
