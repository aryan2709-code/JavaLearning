package testPackage;
import humans.Child;
import multipleInheritance.Smartphone;

public class Test {
    public static void main(String[] args) {

        Child child = new Child(10,"Aryan");
       // Constructor calling sequence : Grandparent -> parent -> child

        Smartphone smartphone = new Smartphone();
        smartphone.clickPhoto(); //inherited from camera
    }
}
