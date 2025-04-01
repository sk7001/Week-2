import java.util.Scanner;

class Student {
    static String universityName = "SRM University";
    String name;
    String grade;
    final int rollNumber;
    static int totalStudents = 0;
    Student(String name, String grade, int rollNumber) {
        this.name = name;
        this.grade = grade;
        this.rollNumber = rollNumber;
        totalStudents++;
    }
    static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }
    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Student Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("Roll Number: " + rollNumber);
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter grade:");
        String grade = scanner.nextLine();
        System.out.println("Enter roll number:");
        int rollNumber = scanner.nextInt();
        Student student = new Student(name, grade, rollNumber);
        if (student instanceof Student) {
            student.displayDetails();
        }
        Student.displayTotalStudents();
    }
}
