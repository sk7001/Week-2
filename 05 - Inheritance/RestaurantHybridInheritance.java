interface Worker {
   void performDuties();
}
class Person {
   String name;
   int id;
   void setDetails(String name, int id) {
       this.name = name;
       this.id = id;
   }
   void displayDetails() {
       System.out.println("Name: " + name);
       System.out.println("ID: " + id);
   }
}
class Chef extends Person implements Worker {
   String specialty;
   void setDetails(String name, int id, String specialty) {
       super.setDetails(name, id);
       this.specialty = specialty;
   }
   public void performDuties() {
       System.out.println("Cooking dishes. Specialty: " + specialty);
   }
   void displayRole() {
       displayDetails();
       performDuties();
       System.out.println();
   }
}
class Waiter extends Person implements Worker {
   String section;
   void setDetails(String name, int id, String section) {
       super.setDetails(name, id);
       this.section = section;
   }
   public void performDuties() {
       System.out.println("Serving customers in section: " + section);
   }
   void displayRole() {
       displayDetails();
       performDuties();
       System.out.println();
   }
}
public class RestaurantHybridInheritance {
   public static void main(String[] args) {
       Chef chef = new Chef();
       chef.setDetails("Ritika", 101, "Italian");
       chef.displayRole();
       Waiter waiter = new Waiter();
       waiter.setDetails("Arun", 102, "Garden View");
       waiter.displayRole();
   }
}
