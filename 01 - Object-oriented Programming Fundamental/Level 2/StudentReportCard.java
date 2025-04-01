import java.util.Scanner;
class Student {
    String name;
    char grade;
    int rollNumber, marks;
    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    void calculateGrade() {
        if (marks >= 90) {
            this.grade = 'O';
        } else if (marks >= 80) {
            this.grade = 'A';
        } else if (marks >= 70) {
            this.grade = 'B';
        } else if (marks >= 60) {
            this.grade = 'C';
        } else if (marks >= 50) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }
    void displayResults() {
        calculateGrade();
        System.out.println("Name of the student: " + name);
        System.out.println("Roll number of the student: " + rollNumber);
        System.out.println("Marks of the student: " + marks);
        System.out.println("Grade of the student: " + grade);
    }
}
public class StudentReportCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name of student: ");
        String name = scanner.nextLine();
        System.out.println("Please enter roll number of student: ");
        int rollNumber = scanner.nextInt();
        System.out.println("Please enter marks of student: ");
        int marks = scanner.nextInt();
        Student student = new Student(name, rollNumber, marks);
        student.displayResults();
    }
}
