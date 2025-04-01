import java.util.Scanner;
class Employee {
    String name;
    int id, salary;
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Employee name :");
        String name = scanner.nextLine();
        System.out.println("Please enter the Employee ID :");
        int id = scanner.nextInt();
        System.out.println("Please enter the Employee salary :");
        int salary = scanner.nextInt();
        Employee emp = new Employee(name, id, salary);
        emp.displayDetails();
    }
}
