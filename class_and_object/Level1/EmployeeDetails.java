//Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.
import java.util.*;
 class Employee{
    private String name;
    private int id;
    private int salary;

    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void results(){
        System.out.println("Name of the Employee = "+name);
        System.out.println("Id of the Employee = "+id);
        System.out.println("Salary of the Employee = "+salary);
    }
}
public class EmployeeDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name ");
        String name = sc.nextLine();
        System.out.println("Enter Employee id ");
        int id = sc.nextInt();
        System.out.println("Enter Employee Salary ");
        int salary = sc.nextInt();
        Employee employee = new Employee(name,id, salary);
        employee.results();
    }
}