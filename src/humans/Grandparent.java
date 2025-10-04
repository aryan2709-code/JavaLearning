package humans;

public class Grandparent {
    private string name;
    private int age;

    // Constructor
    public Grandparent()
    {
        System.out.println("Grandparent constructor called");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }


}
