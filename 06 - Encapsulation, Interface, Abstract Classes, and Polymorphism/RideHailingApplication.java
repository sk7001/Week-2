interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    private String location;
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String location) { this.location = location; }
}

class Bike extends Vehicle implements GPS {
    private String location;
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String location) { this.location = location; }
}

class Auto extends Vehicle implements GPS {
    private String location;
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String location) { this.location = location; }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle car = new Car("V001", "John", 15.0);
        Vehicle bike = new Bike("V002", "Alice", 10.0);
        Vehicle auto = new Auto("V003", "Bob", 12.0);

        car.getVehicleDetails();
        System.out.println("Fare for 20 Km: " + car.calculateFare(20));
        System.out.println();

        bike.getVehicleDetails();
        System.out.println("Fare for 20 Km: " + bike.calculateFare(20));
        System.out.println();

        auto.getVehicleDetails();
        System.out.println("Fare for 20 Km: " + auto.calculateFare(20));
        System.out.println();

        System.out.println("Current Location of Car: " + ((GPS) car).getCurrentLocation());
        ((GPS) car).updateLocation("Location A");
        System.out.println("Updated Location of Car: " + ((GPS) car).getCurrentLocation());
    }
}
