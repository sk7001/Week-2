class Course {
   String courseName;
   int duration;
   void addCourseDetails(String courseName, int duration) {
       this.courseName = courseName;
       this.duration = duration;
   }
   void displayDetails() {
       System.out.println("Course Name: " + courseName);
       System.out.println("Duration: " + duration + " hours");
   }
}
class OnlineCourse extends Course {
   String platform;
   boolean isRecorded;
   void addCourseDetails(String courseName, int duration, String platform, boolean isRecorded) {
       super.addCourseDetails(courseName, duration);
       this.platform = platform;
       this.isRecorded = isRecorded;
   }
   @Override
   void displayDetails() {
       super.displayDetails();
       System.out.println("Platform: " + platform);
       System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
   }
}
class PaidOnlineCourse extends OnlineCourse {
   double fee;
   double discount;
   void addCourseDetails(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
       super.addCourseDetails(courseName, duration, platform, isRecorded);
       this.fee = fee;
       this.discount = discount;
   }
   @Override
   void displayDetails() {
       super.displayDetails();
       System.out.println("Fee: $" + fee);
       System.out.println("Discount: " + discount + "%");
       System.out.println("Final Price: $" + (fee - (fee * discount / 100)));
       System.out.println();
   }
}
public class CourseHierarchyMultilevel {
   public static void main(String[] args) {
       PaidOnlineCourse course = new PaidOnlineCourse();
       course.addCourseDetails("Java Programming", 40, "Udemy", true, 199.99, 20);
       course.displayDetails();
   }
}
