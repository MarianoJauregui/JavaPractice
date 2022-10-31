package main.java.designPatterns.factory;

public class Car implements designPatterns.factory.Vehicle {

    @Override
    public void vehicleDetails() {
        System.out.println("This is a car method");
    }
}
