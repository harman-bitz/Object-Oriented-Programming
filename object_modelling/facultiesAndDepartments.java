import java.util.ArrayList;
import java.util.List;

// University class represents a University and holds Departments (Composition relationship)
class University {
    private String name;
    private List<Department> departments;

    // Constructor to initialize the University with its name and an empty list of departments
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Display all departments and their faculties
    public void displayUniversityStructure() {
        System.out.println("University: " + this.name);
        for (Department department : departments) {
            department.displayDepartmentInfo();
        }
    }

    // Delete the university (this deletes all departments as well)
    public void deleteUniversity() {
        departments.clear();  // This will delete all departments
        System.out.println("University " + this.name + " and all associated departments have been deleted.");
    }
}

// Department class represents a Department in the university (Composition relationship with the university)
class Department {
    private String name;
    private List<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    // Add a faculty to the department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Display department's information along with its faculties
    public void displayDepartmentInfo() {
        System.out.println("Department: " + this.name);
        if (faculties.isEmpty()) {
            System.out.println("No faculties available.");
        } else {
            for (Faculty faculty : faculties) {
                faculty.displayFacultyInfo();
            }
        }
    }

    // Delete the department (this will remove all faculties in the department)
    public void deleteDepartment() {
        faculties.clear();
        System.out.println("Department " + this.name + " and its faculties have been deleted.");
    }
}

// Faculty class represents a Faculty member (Aggregation relationship with department)
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    // Display faculty information
    public void displayFacultyInfo() {
        System.out.println("Faculty: " + this.name);
    }

    // Getter for faculty's name
    public String getName() {
        return this.name;
    }
}

public class facultiesAndDepartments {
    public static void main(String[] args) {
        // Create a university
        University university = new University("XYZ University");

        // Create departments
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mechanical Engineering");

        // Create faculties
        Faculty faculty1 = new Faculty("Dr. John Doe");
        Faculty faculty2 = new Faculty("Dr. Jane Smith");
        Faculty faculty3 = new Faculty("Dr. Emily White");

        // Add faculties to departments
        department1.addFaculty(faculty1);
        department1.addFaculty(faculty2);
        department2.addFaculty(faculty3);

        // Add departments to the university
        university.addDepartment(department1);
        university.addDepartment(department2);

        // Display university structure
        university.displayUniversityStructure();

        // Delete university
        university.deleteUniversity();
    }
}
