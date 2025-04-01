interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public abstract double calculateBill();
    public void getPatientDetails() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int daysAdmitted;
    private String record;
    public InPatient(String patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
    }
    @Override
    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }
    @Override
    public void addRecord(String record) {
        this.record = record;
    }
    @Override
    public String viewRecords() {
        return record;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }
    @Override
    public double calculateBill() {
        return consultationFee;
    }
    @Override
    public void addRecord(String record) {}
    @Override
    public String viewRecords() {
        return "No records for outpatients";
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("P001", "John", 45, 500, 10);
        Patient outPatient = new OutPatient("P002", "Alice", 30, 200);

        inPatient.getPatientDetails();
        System.out.println("Bill: " + inPatient.calculateBill());
        System.out.println("Medical Record: " + ((MedicalRecord) inPatient).viewRecords());
        System.out.println();

        outPatient.getPatientDetails();
        System.out.println("Bill: " + outPatient.calculateBill());
        System.out.println("Medical Record: " + ((MedicalRecord) outPatient).viewRecords());
    }
}
