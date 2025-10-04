package humans;

public class Grandparent {
    private String name;
    private int age;

    // Constructor
    public Grandparent(int age, String name)
    {
        this.age = age;
        this.name = name;
        System.out.println("Grandparent constructor called");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
