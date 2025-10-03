package com.JavaLearning;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World, How are you doing ??");

         BankAccount bankacc = new BankAccount(); // Cannot create objects in stack memory as we did in C++
        bankacc.setAccountNumber(4776585);
        bankacc.deposit(-10);
        bankacc.withdraw(10);
        bankacc.deposit(200);
        bankacc.withdraw(10);
        System.out.println(bankacc.getBalance());

        Student stu = new Student();
        Student stu2 = new Student("Aryan",50,22);
        System.out.println(stu.getAge()); //o/p:10
        System.out.println(stu2.getName() + " " + stu2.getAge() + " " + stu2.getRollNumber()); // Aryan 22 50
    }
}

