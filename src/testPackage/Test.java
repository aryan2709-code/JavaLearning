package testPackage;
import animals.Animal;
import animals.Cat;
import humans.Child;
import multipleInheritance.Smartphone;
import zoo.Dog;

public class Test {
    public static void main(String[] args) {

        Child child = new Child(10,"Aryan");
       // Constructor calling sequence : Grandparent -> parent -> child

        Animal myAnimal = new Animal();
        myAnimal.sayHello();

        Animal dog = new Dog(); // Reference is of Animal (Parent Class) but object attached is of Dog (Child Class)
        dog.sayHello(); // even though, the reference was of parent class , the correct method was invoked, o/p : woof

        //dog.sayBye(); // Even though the Dog class has sayBye method, we can't call it because the reference attached to above dog
        //object is of animal Type and animal does not have any such method


        Animal cat = new Cat(); // This is upcasting
        cat.sayHello();

        Cat myCat = (Cat) cat; // This is downcasting

        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();

         Calling the static method of School to get an instance of School

         Constructor was called only once

        Dog dog = new Dog("Bob");
        dog.makeSound();
        //dog.changeSound("woof");
         // The above line is problematic and will lead to an error
        // Protected members cannot be accessed through object references created in classes outside the package
        // (i.e., external references), unless the accessing class is a subclass and is using inheritance.
        dog.setDogSound("Woof");
        dog.makeSound();


        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student.getCount() ; // O/p : 6 , count was a static property of the student class




    }
}
