package innerclasses;

public class Computer {
    private String brand;
    private String model;
    private OperatingSystem os;


    static class USB{
        private String type;
        public USB(String type)
        {
            this.type = type;
        }

        public void displayInfo()
        {
            System.out.println("USB Type: " + type);
        }
    }


    public Computer(String brand, String model, String osName)
    {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    // An instance of Operating System Inner Class will have a method called displayInfo
    // We will need to provide a getter method to access the instance os(as os is private) , so that this
    // method displayInfo can be called through it


    public OperatingSystem getOs() {
        return os;
    }

    // Member Inner Class Named Operating System
    class OperatingSystem{
        private String osName;
        public OperatingSystem(String osName)
        {
            this.osName = osName;
        }

        public void displayInfo()
        {
            System.out.println("Computer Model: " + model + ", OS: " + osName);
        }
    }
}
