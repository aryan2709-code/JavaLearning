package com.JavaLearning;

public class UseOfCar {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car car = new Car();
        car.color = "Blue";
        car.speed = 40;
        car.brand = "Tata";
        car.year = 2024;
        car.model = "Safari";

        car.accelerate(1);
        System.out.println(car.speed); // o.p : 41
    }
}
