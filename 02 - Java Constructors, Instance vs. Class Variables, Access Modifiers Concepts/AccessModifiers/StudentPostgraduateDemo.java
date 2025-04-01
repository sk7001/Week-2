import java.util.Scanner;
class Student{
   public int rollNumber;
   protected String name;
   private float CGPA;
   Student(int rollNumber, String name, float CGPA){
       this.rollNumber = rollNumber;
       this.name = name;
       this.CGPA = CGPA;
   }
   public float getCGPA(){
       return CGPA;
   }
   public void setCGPA(float CGPA){
       this.CGPA = CGPA;
   }
}
class PostgraduateStudent extends Student{
   PostgraduateStudent(int rollNumber, String name, float CGPA) {
       super(rollNumber, name, CGPA);
   }
   void display(){
       System.out.println("Student name : " + name);
       System.out.println("Student roll number : " + rollNumber);
       System.out.println("Student CGPA : " + getCGPA());
   }
}
public class StudentPostgraduateDemo {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter the name of the student");
       String name = scanner.nextLine();
       System.out.println("Please enter the roll number of the student");
       int rollNUmber = scanner.nextInt();
       System.out.println("Please enter the student's CGPA");
       float CGPA = scanner.nextFloat();
       PostgraduateStudent student = new PostgraduateStudent(rollNUmber, name, CGPA);
       student.display();
   }
}
