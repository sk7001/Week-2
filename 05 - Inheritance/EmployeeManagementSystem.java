class Employee{
   String name;
   int id;
   int salary;
   void addDetails(String name, int id, int salary){
       this.name = name;
       this.id = id;
       this.salary = salary;
   }
   void displayDetails(){
       System.out.println("Name: " + name);
       System.out.println("ID: " + id);
       System.out.println("Salary: " + salary);
   }
}
class Manager extends Employee{
   int teamSize;
   void addDetails(String name, int id, int salary, int teamSize){
       super.addDetails(name, id, salary);
       this.teamSize = teamSize;
   }
   @Override
   void displayDetails() {
       super.displayDetails();
       System.out.println("Team Size: " + teamSize);
       System.out.println();
   }
}
class Developer extends Employee{
   String programmingLanguage;
   void addDetails(String name, int id, int salary, String programmingLanguage){
       super.addDetails(name, id, salary);
       this.programmingLanguage = programmingLanguage;
   }
   @Override
   void displayDetails() {
       super.displayDetails();
       System.out.println("Programming Language: " + programmingLanguage);
       System.out.println();
   }
}
class Intern extends Employee{
   int duration;
   void addDetails(String name, int id, int salary, int duration){
       super.addDetails(name, id, salary);
       this.duration = duration;
   }
   @Override
   void displayDetails(){
        super.displayDetails();
        System.out.println("Duration: " + duration);
       System.out.println();
   }
}
public class EmployeeManagementSystem{
   public static void main(String[] args){
       Manager manager = new Manager();
       manager.addDetails("Sobhit", 41, 50000, 5);
       manager.displayDetails();
       Developer developer = new Developer();
       developer.addDetails("Souji", 41, 50000, "Python");
       developer.displayDetails();
       Intern intern = new Intern();
       intern.addDetails("Sridhar", 41, 50000, 5);
       intern.displayDetails();
   }
}
