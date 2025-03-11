import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display all students in the school and their enrolled courses
    public void displaySchoolStudents() {
        System.out.println("School: " + this.name);
        for (Student student : students) {
            student.displayStudentCourses();
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to enroll a student in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Add the student to the course as well
    }

    // Method to display the courses a student is enrolled in
    public void displayStudentCourses() {
        System.out.println("Student: " + this.name);
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            for (Course course : courses) {
                System.out.println("Enrolled in course: " + course.getName());
            }
        }
    }

    // Getter method to return the student name
    public String getName() {
        return this.name;
    }
}

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display the students enrolled in the course
    public void displayCourseStudents() {
        System.out.println("Course: " + this.name);
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            for (Student student : students) {
                System.out.println("Enrolled student: " + student.getName()); // Print the student's name
            }
        }
    }

    // Getter method to return the course name
    public String getName() {
        return this.name;
    }
}

public class studentWithCourses {

    public static void main(String[] args) {
        // Create a school
        School school = new School("ABC High School");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Display school students and their courses
        school.displaySchoolStudents();

        // Display course students
        course1.displayCourseStudents();
        course2.displayCourseStudents();
    }
}
