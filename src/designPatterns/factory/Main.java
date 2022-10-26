package designPatterns.factory;

public class Main {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.getVehicle("Car");
        car.vehicleDetails();
    }
}
