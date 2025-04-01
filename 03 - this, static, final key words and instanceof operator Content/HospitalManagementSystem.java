import java.util.Scanner;

class Patient {
    static String hospitalName = "City Hospital";
    String name;
    int age;
    String ailment;
    final int patientID;
    static int totalPatients = 0;
    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }
    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter ailment:");
        String ailment = scanner.nextLine();
        System.out.println("Enter patient ID:");
        int patientID = scanner.nextInt();
        Patient patient = new Patient(name, age, ailment, patientID);
        if (patient instanceof Patient) {
            patient.displayDetails();
        }
        Patient.getTotalPatients();
    }
}
