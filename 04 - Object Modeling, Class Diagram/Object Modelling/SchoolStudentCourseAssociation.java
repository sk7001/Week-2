import java.util.ArrayList;
class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
    public String getCourseName() { return courseName; }
    public void enrollStudent(Student student) { enrolledStudents.add(student); }
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
    public String getName() { return name; }
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
    public void addStudent(Student student) { students.add(student); }
    public void showAllStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}
public class SchoolStudentCourseAssociation {
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
