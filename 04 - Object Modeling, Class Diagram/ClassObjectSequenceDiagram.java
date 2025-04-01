/*
Problem 1
import java.util.Scanner;

class Subject{
    String name;
    int marks;
    Subject(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}
class Student{
    String name;
    Subject[] subjects;
    int count=0;
    Student(String name, int totalSubjects){
        this.name = name;
        this.subjects = new Subject[totalSubjects];
    }
    void addSubject(String subjectName, int marks){
        subjects[count] = new Subject(subjectName, marks);
        count++;
    }
    Subject[] getSubjects(){
        return subjects;
    }
    String getName(){
        return name;
    }
}
class GradeCalculator{
    String calculateGrade(Student student){
        Subject[] subjects = student.getSubjects();
        int total = 0;
        for(Subject s : subjects){
            total+=s.marks;
        }
        double average = (double)total/subjects.length;
        if(average>=90) return"A+";
        else if(average>=80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else return "F";
    }
}
public class ClassObjectSequenceDiagram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student name");
        String studentName = scanner.nextLine();
        System.out.println("Please enter number of subjects");
        int numberOfSubjects = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(studentName, numberOfSubjects);
        for(int i = 0; i<numberOfSubjects; i++){
            System.out.println("Please enter name of subject " + (i+1));
            String subjectName = scanner.nextLine();
            System.out.println("Please enter marks of subject " + (i+1));
            int marks = scanner.nextInt();
            student.addSubject(subjectName,marks);
            scanner.nextLine();
        }
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student);

        System.out.println("Student report");
        System.out.println("Name: " + student.getName());
        for(Subject s : student.getSubjects()){
            System.out.println("Subject: " + s.name + ", Marks " + s.marks);
        }
        System.out.println("Final grade: " + grade);
    }
}
*/

/*
Problem 2
import java.util.Scanner;

class Product{
    String productName;
    double weight, price;
    Product(String productName, double weight, double price){
        this.productName = productName;
        this.weight = weight;
        this.price = price;
    }
}
class Customer{
    String name;
    Product[] products;
    int count = 0;
    Customer(String name, int numberOfProducts){
        this.name = name;
        this.products = new Product[numberOfProducts];
    }
    void addProducts(String productName, double weight, double price){
        products[count] = new Product(productName, weight, price);
        count++;
    }
    Product[] getProducts(){
        return products;
    }
    String getName(){
        return name;
    }
}
class BillGenerator{
    double getTotal(Customer customer){
        double total = 0;
        Product[] products = customer.getProducts();
        for(Product p: products){
            total+=p.price*p.weight;
        }
        return total;
    }
}
public class ClassObjectSequenceDiagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of customer");
        String name = scanner.nextLine();
        System.out.println("Please enter number of products");
        int numberOfProducts = scanner.nextInt();
        Customer customer = new Customer(name, numberOfProducts);
        scanner.nextLine();
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Please enter the name of product " + (i + 1));
            String productName = scanner.nextLine();
            System.out.println("Please enter the price of product " + (i + 1));
            double price = scanner.nextDouble();
            System.out.println("Please enter weight/quantity of product " + (i + 1));
            double weight = scanner.nextDouble();
            customer.addProducts(productName, weight, price);
            scanner.nextLine();
        }
        BillGenerator bill = new BillGenerator();
        double totalBill = bill.getTotal(customer);
        System.out.println("Name of the customer " + customer.getName());
        Product[] products = customer.getProducts();
        for (Product product : products) {
            System.out.format("Product name: %s, Price: %.2f, Weight: %.2f, Total price: %.2f\n", product.productName, product.price, product.weight, (product.price*product.weight));
        }
        System.out.format("Total bill: %.2f", totalBill);
    }
}
*/