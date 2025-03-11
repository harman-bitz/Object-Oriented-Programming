import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);  
    }

   
    public List<Department> getDepartments() {
        return departments;
    }

    
    public void displayCompanyStructure() {
        System.out.println("Company: " + this.name);
        for (Department department : departments) {
            department.displayDepartmentInfo();
        }
    }

    
    public void deleteCompany() {
        departments.clear(); 
        System.out.println("Company " + this.name + " and all associated departments and employees have been deleted.");
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    
    public void addEmployee(String employeeName) {
        Employee employee = new Employee(employeeName);
        employees.add(employee);  
    }

    
    public void displayDepartmentInfo() {
        System.out.println("Department: " + this.name);
        for (Employee employee : employees) {
            employee.displayEmployeeInfo();
        }
    }

    
    public void deleteDepartment() {
        employees.clear();  
        System.out.println("Department " + this.name + " and its employees have been deleted.");
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

   
    public void displayEmployeeInfo() {
        System.out.println("Employee: " + this.name);
    }
}

public class companyDepartment{

    public static void main(String[] args) {
        
        Company company = new Company("TechCorp");

     
        company.addDepartment("HR");
        company.addDepartment("Engineering");

        
        company.getDepartments().get(0).addEmployee("Alice");
        company.getDepartments().get(0).addEmployee("Bob");
        company.getDepartments().get(1).addEmployee("Charlie");
        company.getDepartments().get(1).addEmployee("David");

       
        company.displayCompanyStructure();
        company.deleteCompany();
    }
}