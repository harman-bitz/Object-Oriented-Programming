class Person {
    String name;
    int id;
    
    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties();
}

// Subclass: Chef (inherits from Person and implements Worker)
class Chef extends Person implements Worker {
    String specialty;
    
    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }
    
    // Implement performDuties() method
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing dishes in the " + specialty + " section.");
    }
    
    // Overriding displayDetails() to include chef details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
    }
}

// Subclass: Waiter (inherits from Person and implements Worker)
class Waiter extends Person implements Worker {
    int tablesAssigned;
    
    // Constructor
    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }
    
    // Implement performDuties() method
    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tablesAssigned + " tables.");
    }
    
    // Overriding displayDetails() to include waiter details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
    }
}
public class restaurantManagementSystem {

	public static void main(String[] args) {
		
		Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        chef.displayDetails();
        chef.performDuties();
        
        System.out.println("----------------------");
        
        Waiter waiter = new Waiter("John Doe", 201, 5);
        waiter.displayDetails();
        waiter.performDuties();

	}

}
