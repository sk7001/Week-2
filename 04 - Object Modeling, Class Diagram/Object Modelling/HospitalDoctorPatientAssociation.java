import java.util.ArrayList;
class Patient {
    private String name;
    private ArrayList<Doctor> doctors;
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }
    public String getName() { return name; }
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) { doctors.add(doctor); }
    }
    public void showDoctors() {
        System.out.println("Patient " + name + " has consulted with:");
        for (Doctor doc : doctors) {
            System.out.println("- Dr. " + doc.getName());
        }
    }
}
class Doctor {
    private String name;
    private ArrayList<Patient> patients;
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }
    public String getName() { return name; }
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Dr. " + name + " is consulting with patient " + patient.getName());
    }
    public void showPatients() {
        System.out.println("Dr. " + name + " has consulted with:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    public void addDoctor(Doctor doctor) { doctors.add(doctor); }
    public void addPatient(Patient patient) { patients.add(patient); }
    public void showAll() {
        System.out.println("\nHospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) { System.out.println("- Dr. " + d.getName()); }
        System.out.println("Patients:");
        for (Patient p : patients) { System.out.println("- " + p.getName()); }
    }
}
public class HospitalDoctorPatientAssociation {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Care Hospital");
        Doctor d1 = new Doctor("Smith");
        Doctor d2 = new Doctor("Johnson");
        Patient p1 = new Patient("Emily");
        Patient p2 = new Patient("Liam");
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
        d1.showPatients();
        d2.showPatients();
        p1.showDoctors();
        p2.showDoctors();
        hospital.showAll();
    }
}
