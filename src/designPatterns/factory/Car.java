package designPatterns.factory;

public class Car implements Vehicle {

    @Override
    public void vehicleDetails() {
        System.out.println("This is a car method");
    }
}
