import java.util.Scanner;

class Employee {
    static String companyName = "Tech Solutions";
    String name;
    String designation;
    final int id;
    static int totalEmployees = 0;
    Employee(String name, String designation, int id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }
    static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + totalEmployees);
    }
    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Employee ID: " + id);
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter employee designation:");
        String designation = scanner.nextLine();
        System.out.println("Enter employee ID:");
        int id = scanner.nextInt();
        Employee employee = new Employee(name, designation, id);
        if (employee instanceof Employee) {
            employee.displayDetails();
        }
        Employee.displayTotalEmployees();
    }
}
