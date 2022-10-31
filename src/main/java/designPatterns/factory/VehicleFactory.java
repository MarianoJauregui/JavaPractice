package main.java.designPatterns.factory;

public class VehicleFactory {

    public designPatterns.factory.Vehicle getVehicle(String str){
        return switch (str) {
            case "Car" -> new Car();
            case "Motorcycle" -> new designPatterns.factory.Motorcyle();
            case "Truck" -> new Truck();
            default -> null;
        };
    }
}
