import java.util.Scanner;
class Person{
   String name;
   int age;
   float height, weight;
   Person(String name, int age, float height, float weight){
       this.name = name;
       this.age = age;
       this.height = height;
       this.weight = weight;
   }
   Person(Person person){
       this.name = person.name;
       this.age = person.age;
       this.height = person.height;
       this.weight = person.weight;
   }
   void display(){
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Height: " + height);
       System.out.println("Weight: " + weight);
   }
}
public class PersonDemo {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter persons name");
       String name = scanner.nextLine();
       System.out.println("Please enter persons age");
       int age = scanner.nextInt();
       System.out.println("Please enter persons height");
       float height = scanner.nextFloat();
       System.out.println("Please enter persons weight");
       float weight = scanner.nextFloat();
       System.out.println("Parameterised Constructor");
       Person person = new Person(name, age, height, weight);
       person.display();
       System.out.println();
       System.out.println("Copy Constructor");
       Person person1 = new Person(person);
       person1.display();
       scanner.close();
   }
}
