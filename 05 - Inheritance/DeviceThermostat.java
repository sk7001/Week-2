class Device {
   String deviceId;
   String status;
   void setDevice(String deviceId, String status) {
       this.deviceId = deviceId;
       this.status = status;
   }
   void displayStatus() {
       System.out.println("Device ID: " + deviceId);
       System.out.println("Status: " + status);
   }
}
class Thermostat extends Device {
   int temperatureSetting;
   void setDevice(String deviceId, String status, int temperatureSetting) {
       super.setDevice(deviceId, status);
       this.temperatureSetting = temperatureSetting;
   }
   @Override
   void displayStatus() {
       super.displayStatus();
       System.out.println("Temperature Setting: " + temperatureSetting + "°C");
       System.out.println();
   }
}
public class DeviceThermostat {
   public static void main(String[] args) {
       Thermostat thermostat = new Thermostat();
       thermostat.setDevice("THERMO123", "On", 22);
       thermostat.displayStatus();
   }
}
