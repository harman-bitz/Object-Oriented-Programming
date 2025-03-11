class Employee {
	public int employeeID;
	protected String department;
	private double salary;
	
	
	Employee(int employeeID, String department, double salary){
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}
	
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void display() {
		System.out.println("EmployeeID : "+employeeID);
		System.out.println("Department : "+department);
		System.out.println("Salary : "+salary);
	}
}


class Manager extends Employee {
	Manager(int employeeID, String department, double salary){
		super(employeeID, department, salary);
	}
	
	public void display() {
		System.out.println("EmployeeID : "+employeeID);
		System.out.println("Department : "+department);
	}
}


public class employee_record {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101,"HR",1200000);
		emp1.display();
	
		System.out.println();
		
		emp1.setSalary(1500000);
		emp1.display();
		
		
		
		
		System.out.println();
		
		
		
		
		// Creating Manager class object
		Manager m = new Manager(102,"Sales",1800000);
		m.display();
		
	}

}