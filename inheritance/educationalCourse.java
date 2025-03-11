class Course {
    String courseName;
    int duration;
    
    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    
    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse (inherits from Course)
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    
    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Calling the superclass constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    
    // Overriding displayCourseDetails() to include online course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Call the superclass method
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse (inherits from OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    
    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Calling the superclass constructor
        this.fee = fee;
        this.discount = discount;
    }
    
    // Overriding displayCourseDetails() to include payment details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Call the superclass method
        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + (fee - (fee * discount / 100)));
    }
}

public class educationalCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course basicCourse = new Course("Introduction to Programming", 6);
        basicCourse.displayCourseDetails();
        
        System.out.println("----------------------");
        
        // Creating an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Java for Beginners", 8, "Udemy", true);
        onlineCourse.displayCourseDetails();
        
        System.out.println("----------------------");
        
        // Creating a PaidOnlineCourse object
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 12, "Coursera", false, 299.99, 20);
        paidCourse.displayCourseDetails();

	}

}
