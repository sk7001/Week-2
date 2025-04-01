import java.util.ArrayList;
class Faculty {
    private String name;
    public Faculty(String name) { this.name = name; }
    public String getName() { return name; }
}
class Department {
    private String departmentName;
    private ArrayList<Faculty> faculties;
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
    }
    public String getDepartmentName() { return departmentName; }
    public void addFaculty(Faculty faculty) { faculties.add(faculty); }
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
    public void addDepartment(Department department) { departments.add(department); }
    public void addFaculty(Faculty faculty) { aggregatedFaculties.add(faculty); }
    public void showDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Department d : departments) { d.showFaculties(); }
    }
    public void showAllFaculties() {
        System.out.println("All faculties in " + universityName + ":");
        for (Faculty f : aggregatedFaculties) { System.out.println("- " + f.getName()); }
    }
    public void deleteUniversity() {
        departments.clear();
        aggregatedFaculties.clear();
        System.out.println(universityName + " has been deleted.");
    }
}
public class UniversityDepartmentFaculty {
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
