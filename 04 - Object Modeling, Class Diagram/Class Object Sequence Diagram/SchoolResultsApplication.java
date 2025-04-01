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
       if(average>=90) return "A+";
       else if(average>=80) return "A";
       else if (average >= 70) return "B";
       else if (average >= 60) return "C";
       else return "F";
   }
}
public class SchoolResultsApplication {
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
