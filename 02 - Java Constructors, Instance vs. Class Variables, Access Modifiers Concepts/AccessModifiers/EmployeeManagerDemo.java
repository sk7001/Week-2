import java.util.Scanner;
class Employee {
   public int employeeID;
   protected String department;
   private double salary;
   Employee(int employeeID, String department, double salary) {
       this.employeeID = employeeID;
       this.department = department;
       this.salary = salary;
   }
   double getSalary() {
       return salary;
   }
   void setSalary(double salary) {
       this.salary = salary;
   }
}
class Manager extends Employee {
   Manager(int employeeID, String department, double salary) {
       super(employeeID, department, salary);
   }
   void display() {
       System.out.println("Employee ID: " + employeeID);
       System.out.println("Department: " + department);
       System.out.println("Salary: " + getSalary());
   }
}
public class EmployeeManagerDemo {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter employee ID: ");
       int employeeID = scanner.nextInt();
       scanner.nextLine();
       System.out.println("Please enter department: ");
       String department = scanner.nextLine();
       System.out.println("Please enter salary: ");
       double salary = scanner.nextDouble();
       Manager manager = new Manager(employeeID, department, salary);
       manager.display();
   }
}
