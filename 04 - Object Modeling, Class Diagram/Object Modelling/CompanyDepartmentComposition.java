import java.util.ArrayList;
class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void displayEmployee() {
        System.out.println("Employee: " + name);
    }
}
class Department {
    String name;
    ArrayList<Employee> employees;
    Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }
    void addEmployee(Employee emp) {
        employees.add(emp);
    }
    void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}
class Company {
    String name;
    ArrayList<Department> departments;
    Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }
    void addDepartment(Department dept) {
        departments.add(dept);
    }
    void showCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showEmployees();
        }
    }
}
public class CompanyDepartmentComposition {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        Department dev = new Department("Development");
        dev.addEmployee(new Employee("Alice"));
        dev.addEmployee(new Employee("Bob"));
        Department hr = new Department("HR");
        hr.addEmployee(new Employee("Charlie"));
        comp.addDepartment(dev);
        comp.addDepartment(hr);
        comp.showCompanyStructure();
    }
}
