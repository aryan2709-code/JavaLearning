package zoo;

public class Dog extends Animal{

    public Dog(String name)
    {
        super(name,"Bark");
    }

    private String getName()
    {
        return getClass().getSimpleName();
    }

    public void wagTail() {
        System.out.println(getName() + " is wagging its tail.");
    }

    public void setDogSound(String newSound)
    {
        changeSound(newSound); // We are able to call this changeSound method only because it was set as protected in the parent class
    }
    // Non-static methods have a hidden reference to this , the above call: changeSound(newSound); translates to this.changeSound(newSound);

}
