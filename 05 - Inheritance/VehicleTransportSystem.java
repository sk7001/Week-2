class Vehicle {
   int maxSpeed;
   String fuelType;
   void addDetails(int maxSpeed, String fuelType) {
       this.maxSpeed = maxSpeed;
       this.fuelType = fuelType;
   }
   void displayInfo() {
       System.out.println("Max Speed: " + maxSpeed + " km/h");
       System.out.println("Fuel Type: " + fuelType);
   }
}
class Car extends Vehicle {
   int seatCapacity;
   void addDetails(int maxSpeed, String fuelType, int seatCapacity) {
       super.addDetails(maxSpeed, fuelType);
       this.seatCapacity = seatCapacity;
   }
   @Override
   void displayInfo() {
       super.displayInfo();
       System.out.println("Seat Capacity: " + seatCapacity);
       System.out.println();
   }
}
class Truck extends Vehicle {
   int loadCapacity;
   void addDetails(int maxSpeed, String fuelType, int loadCapacity) {
       super.addDetails(maxSpeed, fuelType);
       this.loadCapacity = loadCapacity;
   }
   @Override
   void displayInfo() {
       super.displayInfo();
       System.out.println("Load Capacity: " + loadCapacity + " kg");
       System.out.println();
   }
}
class Motorcycle extends Vehicle {
   boolean hasCarrier;
   void addDetails(int maxSpeed, String fuelType, boolean hasCarrier) {
       super.addDetails(maxSpeed, fuelType);
       this.hasCarrier = hasCarrier;
   }
   @Override
   void displayInfo() {
       super.displayInfo();
       System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
       System.out.println();
   }
}
public class VehicleTransportSystem {
   public static void main(String[] args) {
       Car car = new Car();
       car.addDetails(180, "Petrol", 5);
       Truck truck = new Truck();
       truck.addDetails(120, "Diesel", 10000);
       Motorcycle motorcycle = new Motorcycle();
       motorcycle.addDetails(150, "Petrol", true);
       Vehicle[] vehicles = {car, truck, motorcycle};
       for (Vehicle v : vehicles) {
           v.displayInfo();
       }
   }
}
