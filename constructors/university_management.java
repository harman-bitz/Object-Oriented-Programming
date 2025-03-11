class Student {
	public int rollNumber;
	protected String name;
	private double cgpa;
	
	
	Student(int rollNumber, String name, double cgpa){
		this.rollNumber = rollNumber;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	
	// setter
	public void setCGPA(double cgpa) {
		this.cgpa = cgpa;
	}
	// getter
	public double getCGPA() {
		return cgpa;
	}
	
	// Display Student Details
	public void display() {
		System.out.println("Student Roll Number : "+rollNumber);
		System.out.println("Student Name : "+name);
		System.out.println("CGPA : "+cgpa);
	}
}


class PostGraduateStudent extends Student{
	String specialization;
	
	PostGraduateStudent(int rollNumber, String name, double cgpa, String specialization){
		super(rollNumber, name, cgpa);
		this.specialization = specialization;
	}
	
	// display PostGraduateStudent Details
	public void display() {
		super.display();
		System.out.println("Specialization : "+specialization);
	}
}


public class university_management {

	public static void main(String[] args) {
		
		// Creating Student Object
		Student s1 = new Student(22,"Alex",8.0);
		s1.display();
	
		s1.setCGPA(9.0);
		System.out.println("Upated CGPA : "+s1.getCGPA());
		System.out.println();
		
		
		
		
		
		// Creating PostGraduateStudent Object
		PostGraduateStudent pgs1 = new PostGraduateStudent(10,"Henry",8.5,"UI/UX");
		pgs1.display();
		
		System.out.println();
		
		pgs1.setCGPA(8.9);
		System.out.println("Updated CGPA : "+pgs1.getCGPA());
		System.out.println();
		
		pgs1.display();
		
	}

}
