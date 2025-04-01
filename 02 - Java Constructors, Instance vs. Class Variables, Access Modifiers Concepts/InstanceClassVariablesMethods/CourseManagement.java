import java.util.Scanner;
class Course{
   String courseName;
   int duration, fee;
   static String institutionName = "SRMIST";
   Course(String courseName, int duration, int fee){
       this.courseName = courseName;
       this.duration = duration;
       this.fee = fee;
   }
   void displayCourseDetails(){
       System.out.println("Course name: " + courseName);
       System.out.println("Duration: " + duration);
       System.out.println("Fee: " + fee);
       System.out.println("Institute name: " + institutionName);
   }
   static void updateInstitueName(String newInstituteName){
       institutionName = newInstituteName;
   }
}
public class CourseManagement {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter name of the course");
       String courseName = scanner.nextLine();
       System.out.println("Please enter duration of the course");
       int duration = scanner.nextInt();
       System.out.println("Please enter price of the course");
       int fee = scanner.nextInt();
       scanner.nextLine();
       Course course = new Course(courseName, duration, fee);
       course.displayCourseDetails();
       System.out.println("Please enter new name to change the Institute name");
       String instituteName = scanner.nextLine();
       Course.updateInstitueName(instituteName);
       course.displayCourseDetails();
   }
}
