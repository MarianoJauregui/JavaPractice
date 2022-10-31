package main.java.designPatterns.factory;

public class DesignPatternsMain {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();
        designPatterns.factory.Vehicle car = vehicleFactory.getVehicle("Car");
        car.vehicleDetails();
    }
}
