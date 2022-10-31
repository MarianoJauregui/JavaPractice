package main.java.designPatterns.factory;

public class VehicleFactory {

    public Vehicle getVehicle(String str){
        return switch (str) {
            case "Car" -> new Car();
            case "Motorcycle" -> new Motorcyle();
            case "Truck" -> new Truck();
            default -> null;
        };
    }
}
