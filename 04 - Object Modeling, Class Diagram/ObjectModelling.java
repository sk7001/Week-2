/*
Problem 1
import java.util.ArrayList;
import java.util.Scanner;

class Book{
    String title, author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    void displayBook(){
        System.out.println("Book name: " + title + ", Author name: " + author);
    }
}
class Library{
    String name;
    ArrayList<Book> books;
    Library(String name){
        this.name = name;
        books = new ArrayList<>();
    }
    void addBook(Book book){
        books.add(book);
    }
    void showBooks(){
        System.out.println("Library " + name);
        for(Book book: books){
            book.displayBook();
        }
    }
}
public class ObjectModelling {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter title of the book");
        String bookTitle = scanner.nextLine();
        System.out.println("Please enter the author of the book");
        String author = scanner.nextLine();
        Book b1 = new Book(bookTitle, author);
        Library l1 = new Library("School Library");
        l1.addBook(b1);
        Library l2 = new Library("Public Library");
        l2.addBook(b1);
        scanner.close();
        l1.showBooks();
        l2.showBooks();
    }
}
*/

/*
Problem 2
class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer) {
        System.out.println(customer.name + " opened an account at " + name);
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void viewBalance() {
        System.out.println(name + "'s balance is Rs.5000");
    }
}

public class ObjectModelling {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");
        Customer cust1 = new Customer("Alice");
        Customer cust2 = new Customer("Bob");

        bank.openAccount(cust1);
        bank.openAccount(cust2);

        cust1.viewBalance();
        cust2.viewBalance();
    }
}
*/

/*
Problem 3
import java.util.*;

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

public class ObjectModelling {
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
*/

/*
Problem 1
import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showAllStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

public class ObjectModelling {
    public static void main(String[] args) {
        School school = new School("Bright Future School");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);
        s2.enrollInCourse(c1);

        school.showAllStudents();

        s1.viewCourses();
        s2.viewCourses();

        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}
*/

/*
Problem 2
import java.util.ArrayList;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String departmentName;
    private ArrayList<Faculty> faculties;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showFaculties() {
        System.out.println("Department: " + departmentName);
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getName());
        }
    }
}

class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> aggregatedFaculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.aggregatedFaculties = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        aggregatedFaculties.add(faculty);
    }

    public void showDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Department d : departments) {
            d.showFaculties();
        }
    }

    public void showAllFaculties() {
        System.out.println("All faculties in " + universityName + ":");
        for (Faculty f : aggregatedFaculties) {
            System.out.println("- " + f.getName());
        }
    }

    public void deleteUniversity() {
        departments.clear();
        aggregatedFaculties.clear();
        System.out.println(universityName + " has been deleted.");
    }
}

public class ObjectModelling {
    public static void main(String[] args) {
        University uni = new University("Global Tech University");

        Faculty f1 = new Faculty("Dr. Alice");
        Faculty f2 = new Faculty("Dr. Bob");
        Faculty f3 = new Faculty("Dr. Charlie");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        Department d1 = new Department("Computer Science");
        d1.addFaculty(f1);

        Department d2 = new Department("Mechanical Engineering");
        d2.addFaculty(f3);

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.showAllFaculties();
        uni.showDepartments();

        uni.deleteUniversity();
    }
}
*/

/*
Problem 4
import java.util.ArrayList;

class Patient {
    private String name;
    private ArrayList<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
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

    public String getName() {
        return name;
    }

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

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showAll() {
        System.out.println("\nHospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }

        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

public class ObjectModelling {
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
*/

/*
Problem 4
import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private static int orderCounter = 1;
    private int orderId;
    private ArrayList<Product> products;

    public Order() {
        this.orderId = orderCounter++;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p.getName() + ": $" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}

class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order #" + order.getOrderId());
    }

    public void viewOrders() {
        System.out.println("\nCustomer: " + name + " - Order History:");
        for (Order order : orders) {
            order.showOrderDetails();
            System.out.println();
        }
    }
}

public class ObjectModelling {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Mouse", 25.50);
        Product p3 = new Product("Keyboard", 45.00);

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        Order order1 = new Order();
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order();
        order2.addProduct(p2);
        order2.addProduct(p3);

        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        customer1.viewOrders();
        customer2.viewOrders();
    }
}
*/

/*
Problem 5
import java.util.ArrayList;

class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to " + courseName);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getName() + " enrolled in " + courseName);
    }

    public String getCourseName() {
        return courseName;
    }

    public void showDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("Professor: Not Assigned");
        }

        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public String getName() {
        return name;
    }

    public void viewCourses() {
        System.out.println(name + "'s Enrolled Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class Professor {
    private String name;
    private ArrayList<Course> coursesTaught;

    public Professor(String name) {
        this.name = name;
        this.coursesTaught = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        coursesTaught.add(course);
        course.assignProfessor(this);
    }

    public String getName() {
        return name;
    }

    public void viewCourses() {
        System.out.println("Courses taught by Professor " + name + ":");
        for (Course c : coursesTaught) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class University {
    private String name;
    private ArrayList<Course> courses;

    public University(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course " + course.getCourseName() + " added to university: " + name);
    }

    public void showAllCourses() {
        System.out.println("\nAll Courses in " + name + ":");
        for (Course c : courses) {
            c.showDetails();
            System.out.println();
        }
    }
}

public class ObjectModelling {
    public static void main(String[] args) {
        University uni = new University("SmartTech University");

        Course math = new Course("Mathematics");
        Course cs = new Course("Computer Science");
        Course physics = new Course("Physics");

        uni.addCourse(math);
        uni.addCourse(cs);
        uni.addCourse(physics);

        Professor prof1 = new Professor("Dr. Brown");
        Professor prof2 = new Professor("Dr. Green");

        prof1.assignCourse(math);
        prof2.assignCourse(cs);
        prof2.assignCourse(physics);

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.enrollCourse(math);
        s1.enrollCourse(cs);
        s2.enrollCourse(cs);
        s2.enrollCourse(physics);

        System.out.println();
        s1.viewCourses();
        System.out.println();
        s2.viewCourses();
        System.out.println();
        prof1.viewCourses();
        prof2.viewCourses();

        uni.showAllCourses();
    }
}
 */