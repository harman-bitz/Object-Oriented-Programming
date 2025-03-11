class Person {
    String name;
    int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Teacher (inherits from Person)
class Teacher extends Person {
    String subject;
    
    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age); // Calling the superclass constructor
        this.subject = subject;
    }
    
    // Overriding displayDetails() to include teacher details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student (inherits from Person)
class Student extends Person {
    int grade;
    
    // Constructor
    public Student(String name, int age, int grade) {
        super(name, age); // Calling the superclass constructor
        this.grade = grade;
    }
    
    // Overriding displayDetails() to include student details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff (inherits from Person)
class Staff extends Person {
    String department;
    
    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age); // Calling the superclass constructor
        this.department = department;
    }
    
    // Overriding displayDetails() to include staff details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class schoolSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher teacher = new Teacher("Alice Johnson", 40, "Mathematics");
        teacher.displayDetails();
        
        System.out.println("----------------------");
        
        // Creating a Student object
        Student student = new Student("Bob Smith", 16, 10);
        student.displayDetails();
        
        System.out.println("----------------------");
        
        // Creating a Staff object
        Staff staff = new Staff("Charles Brown", 35, "Administration");
        staff.displayDetails();

	}

}
